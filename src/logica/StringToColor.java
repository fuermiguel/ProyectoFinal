/*
 Clase que convierte un cadena en formato 
java.awt.Color[r=255,g=255,b=51] a rgb
 */
package logica;

/**
 *
 * @author Miguel
 */
public class StringToColor {

    private int r = 0;
    private int g = 0;
    private int b = 0;
    private String cadena;

    public StringToColor(String cadena) {
        this.cadena = cadena;
        convertir(cadena);
    }

    private void convertir(String cadena) {
        if (cadena != null && !cadena.equals("")){
            cadena = cadena.substring(cadena.indexOf("["));
            String cadenaR = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf(","));
            cadena = cadena.substring(cadena.indexOf(",") + 1);
            String cadenaG = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf(","));
            cadena = cadena.substring(cadena.indexOf(","));
            String cadenaB = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf("]"));

            r = new Integer(cadenaR);
            g = new Integer(cadenaG);
            b = new Integer(cadenaB);
        }

    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

}
