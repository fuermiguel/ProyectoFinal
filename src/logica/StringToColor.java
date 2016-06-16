/*
 Clase que convierte un cadena en formato 
java.awt.Color[r=255,g=255,b=51] a rgb
 */
package logica;

/**
 * Clase StringToColor
 *
 * Extrae del formato java.awt.Color[r=xxx,g=xxx,b=xxx] los valores enteros de
 * R,G,B
 *
 * @author Miguel
 * @version 1.0 16/06/2016
 */
public class StringToColor {

    /**
     * valor R
     */
    private int r = 0;
    /**
     * valor G
     */
    private int g = 0;
    /**
     * valor B
     */
    private int b = 0;
    /**
     * cadena java.awt.Color[r=xxx,g=xxx,b=xxx]
     */
    private String cadena = "";

    /**
     * Constructor
     *
     * @param cadena cadena con formato java.awt.Color[r=xxx,g=xxx,b=xxx]
     */
    public StringToColor(String cadena) {
        this.cadena = cadena;
        convertir(cadena);
    }

    /**
     * Método que extrae de la cadena los valores de R,G,B
     *
     * @param cadena cadena con formato java.awt.Color[r=xxx,g=xxx,b=xxx]
     */
    private void convertir(String cadena) {
        if (cadena != null && !cadena.equals("")) {
            cadena = cadena.substring(cadena.indexOf("["));
            String cadenaR = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf(","));
            cadena = cadena.substring(cadena.indexOf(",") + 1);
            String cadenaG = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf(","));
            cadena = cadena.substring(cadena.indexOf(","));
            String cadenaB = cadena.substring(cadena.indexOf("=") + 1, cadena.indexOf("]"));

            try {
                int temp_r = new Integer(cadenaR);
                int temp_g = new Integer(cadenaG);
                int temp_b = new Integer(cadenaB);
                if ((temp_r < 256) && (temp_r < 256) && (temp_r < 256)
                        && (0 < temp_r) && (0 < temp_r) && (0 < temp_r)) {
                    r = temp_r;
                    g = temp_g;
                    b = temp_b;
                }

            } catch (NumberFormatException evt) {
                r = 0;
                g = 0;
                b = 0;
            }
        }

    }

    /**
     *getter del valor R
     * 
     * @return valor de R
     */

    public int getR() {
        return r;
    }

    /**
     *getter del valor G
     * 
     * @return valor de G
     */
    public int getG() {
        return g;
    }

    /**
     *getter del valor B
     * 
     * @return valor de B
     */

    public int getB() {
        return b;
    }

}
