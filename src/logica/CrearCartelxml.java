/*
 *Para crear el archivo xml
 */
package logica;

import java.io.File;
import java.io.FileInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import objetos.Cartel;
import org.netbeans.xml.schema.cartel.TipoCabecera;
import org.netbeans.xml.schema.cartel.TipoPie;
import org.netbeans.xml.schema.cartel.TipoPlantilla;
import org.netbeans.xml.schema.cartel.TipoPrincipal;

/**
 *
 * @author Miguel
 */
public class CrearCartelxml {

    public CrearCartelxml(Cartel cartel) throws Throwable {

        JAXBContext jaxbContext = JAXBContext.newInstance("org.netbeans.xml.schema.cartel");
        Unmarshaller u = jaxbContext.createUnmarshaller();
        JAXBElement jaxbElement = (JAXBElement) u.unmarshal(
                new FileInputStream("plantillas"
                        + System.getProperty("file.separator") + "plantilla.xml"));

        TipoPlantilla crearCartel = (TipoPlantilla) jaxbElement.getValue();
        //Cojer la plantilla y rellenarla

        TipoCabecera cabecera = new TipoCabecera();
        TipoPrincipal principal = new TipoPrincipal();
        TipoPie pie = new TipoPie();

        cabecera.setImagen(cartel.getCabecera());
        cabecera.setFondo(cartel.getColorFondo().toString());

        principal.setImagen(cartel.getPrincipal());
        principal.setFondo(cartel.getColorFondo().toString());

        pie.setFondo(cartel.getColorFondo().toString());
        pie.getSponsor().addAll(cartel.getSponsors());

        crearCartel.setCabecera(cabecera);
        crearCartel.setPrincipal(principal);
        crearCartel.setPie(pie);

        //Creo el archivo
        Marshaller m = jaxbContext.createMarshaller();

        //Le damos formato legible por personas
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Tengo que generar el número del cartel
        //Creamos el nuevo fichero con la nueva información
        File fichero = new File("carteles"
                + System.getProperty("file.separator") + "cartel" + numeroCartel()+1 + ".xml");
        m.marshal(jaxbElement, fichero);

        //Lo mostramos por salida estandar
        m.marshal(jaxbElement, System.out);

        /*
        //Pasar de un objeto a xml
        //Cojo la plantilla y la modifico
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();

        Document document = implementation.createDocument(null, "Plantilla", null);

        document.setXmlVersion("1.0");

        Element raiz = document.getDocumentElement();

        Element nodoCabecera = document.createElement("cabecera"); //creamos un nuevo elemento
        Element nodoPrincipal = document.createElement("Principal");
        Element nodoPie = document.createElement("Pie");

        //Element nodoImagenCabecera = nodoCabecera.appendChild("imagen");
        //Text nodoValorCampo = document.createTextNode("contenido del elemento hijo"); //Ingresamos la info				
        //nodoNombreCampo.appendChild(nodoValorCampo);
        raiz.appendChild(nodoCabecera); //pegamos el elemento a la raiz "Documento"
        raiz.appendChild(nodoPrincipal);
        raiz.appendChild(nodoPie);

        Element nodoImagenCabecera = document.createElement("imagen");
        Element nodoImagenPrincipal = document.createElement("imagen");
        Element nodoImagenPie = document.createElement("imagen");

        nodoCabecera.appendChild(nodoImagenCabecera);
        nodoPrincipal.appendChild(nodoImagenPrincipal);
        nodoPie.appendChild(nodoImagenPie);

        Element nodoFondoCabecera = document.createElement("fondo");
        Element nodoFondoPrincipal = document.createElement("fondo");
        Element nodoFondoPie = document.createElement("fondo");
        
        nodoCabecera.appendChild(nodoFondoCabecera);
        nodoPrincipal.appendChild(nodoFondoPrincipal);
        nodoPie.appendChild(nodoFondoPie);


        /*
        <?xml version="1.0" encoding="UTF-8"?>
        <documento>
            <ElementoHijoDeLaRaíz>contenido del elemento hijo</ElementoHijoDeLaRaíz>
        </documento>
         */
 /*
        <?xml version="1.0" encoding="windows-1252"?>
<ns1:plantilla
    xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
    xmlns:ns1='http://xml.netbeans.org/schema/cartel'
    xsi:schemaLocation='http://xml.netbeans.org/schema/cartel cartel.xsd'>
    <ns1:cabecera>
        <ns1:imagen>cabecera1.png</ns1:imagen>
        <ns1:fondo>blue</ns1:fondo>
    <ns1:principal>
        <ns1:imagen>principal1.png</ns1:imagen>
        <ns1:fondo>blue</ns1:fondo>
    </ns1:principal>
    <ns1:pie>
        <ns1:sponsor>rebook.png</ns1:sponsor>
        <ns1:sponsor>adidas.png</ns1:sponsor>
        <ns1:sponsor>cocacola.png</ns1:sponsor>
        <ns1:sponsor>redbull.png</ns1:sponsor>
        <ns1:fondo>blue</ns1:fondo>
    </ns1:pie>

</ns1:plantilla>
         *//*
        Source source = new DOMSource(document);
        Result result = new StreamResult(new java.io.File("resultado.xml//nombre del archivo"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, result);

        super.finalize();*/
    }

    private int numeroCartel() {
        //Leer el número de archivos de la carpeta carteles
        File file = new File("carteles" + System.getProperty("file.separator"));
        return file.list().length;
    }
}
