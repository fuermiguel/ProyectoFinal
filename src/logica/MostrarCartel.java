/*
 * Muestra los carteles en un jform. Coje la información del cartel de un 
archivo xml.
 */
package logica;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import objetos.Cartel;
import org.netbeans.xml.schema.cartel.TipoPlantilla;
import pantallas.Plantilla1;
import pantallas.Plantilla2;
import pantallas.VerCarteles;
import static pantallas.VerCarteles.session;

/**
 *
 * @author Miguel
 */
public class MostrarCartel {

    //Sesion que ya está abierta en VerCarteles
    BaseXClient session = VerCarteles.session;

    public String fndCabecera, imgCabecera, fndPrincipal, imgPrincipal, fndPie;
    public List<String> sponsors;
    private String nombreCartel;
    private int tipoPlantilla;

    public MostrarCartel(String nombreCartel, int tipoPlantilla) {
        this.nombreCartel = nombreCartel;
        this.tipoPlantilla = tipoPlantilla;
        cargaCartel(nombreCartel);
    }

    private void cargaCartel(String nombreCartel) {
        try {

            /* Crear una instancia de la clase JAXBContext para
    poder manipular las clases generadas en el paquete jaxb.plantilla
    La clase JAXBContext proporciona al cliente un punto de entrada a la API JAXB
    Facilita una abstracción para manejar la información generada para
    implementar las operaciones del JAXB binding framework como unmarshal y marshal
    unmarshal: consiste en convertir datos XML en un árbol de objetos Java
    marshal: consiste en convertir un árbol de objetos Java a datos XML*/
            System.out.println("inicio mostrar plantilla");
            JAXBContext jaxbContext = JAXBContext.newInstance("org.netbeans.xml.schema.cartel");
            System.out.println("instancié el paquete que contiene las clases generadas");

            // Crear un objeto de tipo Unmarshaller para convertir datos XML en un árbol de objetos Java
            Unmarshaller u = jaxbContext.createUnmarshaller();

            // La clase JAXBElement representa a un elemento de un documento XML
            // en este caso a un elemento del documento plantilla.xml
            /*JAXBElement jaxbElement = (JAXBElement) u.unmarshal(
                               new FileInputStream(System.getProperty("user.home")
                               + System.getProperty("file.separator") + "albaran.xml"));*/
 /*     JAXBElement jaxbElement = (JAXBElement) u.unmarshal(
                    new FileInputStream("C:\\Users\\Miguel\\Documents"
                            + "\\NetBeansProjects\\Carteles1\\src\\"
                            + "carteles\\" + nombreCartel + ".xml"));*/
 /* JAXBElement jaxbElement = (JAXBElement) u.unmarshal(
                    new FileInputStream("carteles"+ System.getProperty("file.separator") +
                            nombreCartel + ".xml"));*/
            BaseXClient.Query documento = session.query("db:open(\"pruebaXML\",\"" + nombreCartel
                    + ".xml\")");

            String text = documento.next();
            Reader reader = new StringReader(text);
            XMLInputFactory factory = XMLInputFactory.newInstance(); // Or newFactory()
            XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);

            JAXBElement jaxbElement = (JAXBElement) u.unmarshal(xmlReader);

            // Obtenemos una instancia de tipo Plantilla para obtener un Objeto 
            //de tipo Plantilla
            TipoPlantilla cartel = (TipoPlantilla) jaxbElement.getValue();
            // Establecemos los datos
            Cartel plantilla = new Cartel();

            StringToColor fondoCabecera = new StringToColor(cartel.getCabecera().getFondo());

            plantilla.setColorFondo(new Color(
                    fondoCabecera.getR(),
                    fondoCabecera.getG(),
                    fondoCabecera.getB()
            ));
            plantilla.setCabecera(cartel.getCabecera().getImagen());

            plantilla.setPrincipal(cartel.getPrincipal().getImagen());

            plantilla.setSponsors(cartel.getPie().getSponsor());

            //Muestro la ventana de seleccion de plantilla
            switch (tipoPlantilla) {
                case 0: {
                    Plantilla1 plantilla1 = new Plantilla1(plantilla);
                    plantilla1.setVisible(true);
                    break;
                }
                case 1: {
                    Plantilla2 plantilla2 = new Plantilla2(plantilla);
                    plantilla2.setVisible(true);
                    break;
                }

            }

            // Crear un objeto de tipo Marshaller para posteriormente convertir un
            // el árbol de objetos Java a datos XML
            Marshaller m = jaxbContext.createMarshaller();

            // El método setProperty(String nombrePropiedad, Object value) recibe en este
            // caso la propiedad "jaxb.formatted.output". Esta propiedad controla si al
            // realizar un marshal, debe formatear el resultado XML con saltos de linea
            // e indentaciones para que las personas podamos leerlo cómodamente. Por defecto
            // su valor es falso es decir el XML creado no está formateado
            // El argumento value en este caso tiene que ser concretamente de tipo Boolean
            // para indicar si queremos que el resultado XML esté formateado o no
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // El método marshall(Object elementoJAXB, OutputStream os) recibe un objeto
            // de tipo JAXBElement para que su contenido lo muestre en la salida estándar
            // debido a que este método está sobrecargo, si miramos la documentación de
            //la API podemos ver como podemos mostrar o escribir el resultado XML de
            //diferentes maneras
            m.marshal(jaxbElement, System.out);

        } catch (JAXBException je) {
            System.out.println("uno");
            System.out.println(je.getCause());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (XMLStreamException ex) {
            Logger.getLogger(MostrarCartel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
