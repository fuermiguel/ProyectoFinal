/*
 * Clase que extrae RGB de una cadena con el siguiente formato:
java.awt.Color[r=102,g=102,b=0]
 */
package logica;

/**
 *
 * @author Miguel
 */
public class CadenaRGB {

    private String cadena;

    private int r;
    private int g;
    private int b;

    public CadenaRGB(String cadena) {
        this.cadena = cadena;
    }

    private void extraerRgb() {
        //java.awt.Color[r=102,g=102,b=0]
        //Subcadena entre corchetes
        String entreCorchetes = cadena.substring(cadena.indexOf("[") + 1);
        String subcadenaR = entreCorchetes.substring(0, entreCorchetes.indexOf(",") );
        entreCorchetes = entreCorchetes.substring(entreCorchetes.indexOf(",") + 1);
        String subcadenaG = entreCorchetes.substring(0, entreCorchetes.indexOf(",") );
        String subcadenaB = entreCorchetes.substring(entreCorchetes.indexOf(",") + 1, entreCorchetes.length() - 1);

        r = new Integer(subcadenaR.substring(subcadenaR.indexOf("=") + 1));
        g = new Integer(subcadenaG.substring(subcadenaG.indexOf("=") + 1));
        b = new Integer(subcadenaB.substring(subcadenaB.indexOf("=") + 1));

     
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
/*
    public static void main(String[] args) {
        new CadenaRGB("java.awt.Color[r=102,g=102,b=0]").extraerRgb();
    }*/
}
