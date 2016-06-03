/*
 * Muestra los carteles en un jform. Coje la información del cartelObtenido de un 
archivo xml.
 */
package logica;

import java.awt.Color;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import objetos.Cartel;
import org.netbeans.xml.schema.cartel.TipoPlantilla;
import pantallas.Plantilla1;
import pantallas.Plantilla2;
import pantallas.VerCarteles;

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
           
            JAXBContext jaxbContext = JAXBContext.newInstance("org.netbeans.xml.schema.cartel");      

            // Crear un objeto de tipo Unmarshaller para convertir datos XML en un árbol de objetos Java
            Unmarshaller u = jaxbContext.createUnmarshaller();

            BaseXClient.Query documento = session.query("db:open(\"pruebaXML\",\"" + nombreCartel
                    + ".xml\")");

            String text = documento.next();
            Reader reader = new StringReader(text);
            XMLInputFactory factory = XMLInputFactory.newInstance(); // Or newFactory()
            XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);

            JAXBElement jaxbElement = (JAXBElement) u.unmarshal(xmlReader);

            // Obtenemos una instancia de tipo Plantilla para obtener un Objeto 
            //de tipo Plantilla obtenido en el mapeo
            TipoPlantilla cartelObtenido = (TipoPlantilla) jaxbElement.getValue();
            
            // 
            Cartel objetoCartel = new Cartel();

            StringToColor fondoCabecera = new StringToColor(cartelObtenido.getCabecera().getFondo());

            objetoCartel.setColorFondo(new Color(
                    fondoCabecera.getR(),
                    fondoCabecera.getG(),
                    fondoCabecera.getB()
            ));
            objetoCartel.setCabecera(cartelObtenido.getCabecera().getImagen());

            objetoCartel.setPrincipal(cartelObtenido.getPrincipal().getImagen());

            objetoCartel.setSponsors(cartelObtenido.getPie().getSponsor());

            //Muestro la ventana de seleccion de objetoCartel
            switch (tipoPlantilla) {
                case 0: {
                    Plantilla1 plantilla1 = new Plantilla1(objetoCartel);
                    plantilla1.setVisible(true);
                    break;
                }
                case 1: {
                    Plantilla2 plantilla2 = new Plantilla2(objetoCartel);
                    plantilla2.setVisible(true);
                    break;
                }
            }
        } catch (JAXBException je) {
            System.out.println(je.getCause());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (XMLStreamException ex) {
            Logger.getLogger(MostrarCartel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
