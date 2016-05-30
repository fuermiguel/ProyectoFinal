/*
 * Es el cartel creado por nosotros
 */
package objetos;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Cartel {
private String cabecera;
private String principal;
private String pie;
private Color colorFondo;
private List<String> sponsors;
    public Cartel() {
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public List<String> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<String> sponsors) {
        this.sponsors = sponsors;
    }
    
}
