/*
 *Para crear el archivo xml
 */
package logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import logica.BaseXClient.Query;
import objetos.Cartel;
import org.netbeans.xml.schema.cartel.TipoCabecera;
import org.netbeans.xml.schema.cartel.TipoPie;
import org.netbeans.xml.schema.cartel.TipoPlantilla;
import org.netbeans.xml.schema.cartel.TipoPrincipal;
import pantallas.CrearCartel;

/**
 *
 * @author Miguel
 */
public class CrearCartelxml {
    //Sesion que ya está abierta en VerCarteles

    BaseXClient session = CrearCartel.session;

    public CrearCartelxml(Cartel cartel) throws Throwable {

        JAXBContext jaxbContext = JAXBContext.newInstance("org.netbeans.xml.schema.cartel");
        Unmarshaller u = jaxbContext.createUnmarshaller();

        //Utilizo como base una plantilla de xml que modficaré con los datos del cartel
        JAXBElement jaxbElement = (JAXBElement) u.unmarshal(
                new FileInputStream("plantillas"
                        + System.getProperty("file.separator") + "plantilla.xml"));

        TipoPlantilla cartelFinal = (TipoPlantilla) jaxbElement.getValue();

        //Instancio los objetos mapeados con la información base de la plantilla(sin información)
        TipoCabecera cabecera = new TipoCabecera();
        TipoPrincipal principal = new TipoPrincipal();
        TipoPie pie = new TipoPie();

        //Asigno información del cartel que viene de la ventana crear cartel
        cabecera.setImagen(cartel.getCabecera());
        cabecera.setFondo(cartel.getColorFondo().toString());

        principal.setImagen(cartel.getPrincipal());
        principal.setFondo(cartel.getColorFondo().toString());

        pie.setFondo(cartel.getColorFondo().toString());
        pie.getSponsor().addAll(cartel.getSponsors());

        //Asignamos las partes al cartel final
        cartelFinal.setCabecera(cabecera);
        cartelFinal.setPrincipal(principal);
        cartelFinal.setPie(pie);

        //Creo el archivo
        Marshaller m = jaxbContext.createMarshaller();

        //Le damos formato legible por personas
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Tengo que generar el número del cartel
        //Creamos el nuevo fichero con la nueva información
        File fichero = new File("temp"
                + System.getProperty("file.separator") + "cartel" + numeroCartel() + ".xml");

        //Serializo el cartel al fichero creado
        m.marshal(jaxbElement, fichero);
        
        session.execute("open pruebaXML");
        session.execute("add "  +
                System.getProperty("user.dir")+
                System.getProperty("file.separator") + 
                fichero);
        
        //Borro el temporal
        fichero.delete();

        JOptionPane.showMessageDialog(null, "Cartel creado con exito.");

        //Lo mostramos por salida estandar
        // m.marshal(jaxbElement, System.out);
    }
//Hay que leerlo de la base de datos

    private int numeroCartel() {
        int i = 1;
        try {
            Query nCarteles = session.query("db:list(\"pruebaXml\")");
            while (nCarteles.more()) {
                nCarteles.next();
                i++;
            }

        } catch (IOException ex) {
            Logger.getLogger(CrearCartelxml.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
