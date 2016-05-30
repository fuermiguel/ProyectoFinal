/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import objetos.Cartel;

/**
 *
 * @author Miguel
 */
public class Plantilla1 extends JFrame{

   private Cartel plantilla;

    /**
     * Creates new form MostrarPlantillas
     */
    public Plantilla1(Cartel plantilla) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       this.plantilla = plantilla;
        rellenarComponentes();
    }
    
    private void rellenarComponentes() {
        //Color de los fondos
         pnl_fondoCabeceraP1.setBackground(plantilla.getColorFondo());
         pnl_fondoPrincipalP1.setBackground(plantilla.getColorFondo());
         pnl_fondoPiep1.setBackground(plantilla.getColorFondo());
         this.getContentPane().setBackground(plantilla.getColorFondo());
         
        //Imagen Cabecera 
        ImageIcon cabecera = new ImageIcon("ImagenesCabecera"+
                System.getProperty("file.separator")+ plantilla.getCabecera());
        Icon iconoCabecera = new ImageIcon(cabecera.getImage().getScaledInstance(
                 lbl_cabecera.getWidth(), lbl_cabecera.getHeight(),
                Image.SCALE_DEFAULT));
        lbl_cabecera.setIcon(iconoCabecera);
        
        //Imagen Principal
         ImageIcon principal = new ImageIcon("imagenesPrincipal"+
                 System.getProperty("file.separator") + plantilla.getPrincipal());
         Icon iconoPrincipal = new ImageIcon(principal.getImage().getScaledInstance(
                 lbl_principal.getWidth(), lbl_principal.getHeight(),
                Image.SCALE_DEFAULT));
        lbl_principal.setIcon(iconoPrincipal);
        
        //Crear una lista de sponsor
        List <JLabel>etiquetas = new ArrayList<JLabel>();
        etiquetas.add(lbl_pie1);
        etiquetas.add(lbl_pie2);
        etiquetas.add(lbl_pie3);
        etiquetas.add(lbl_pie4);
        etiquetas.add(lbl_pie5);
        etiquetas.add(lbl_pie6);
        
        //relleno los sponsors de izquierda a derecha
       
        int i= 0;
        for(String sponsor : plantilla.getSponsors()){          
         ImageIcon imagenSponsor = new ImageIcon("ImagenesEsponsors"+
                 System.getProperty("file.separator") + sponsor);
         Icon iconoSponsor;
             iconoSponsor = new ImageIcon(imagenSponsor.getImage().getScaledInstance(
                      etiquetas.get(i).getWidth(), etiquetas.get(i).getHeight(),
                     Image.SCALE_DEFAULT));
        
         etiquetas.get(i).setIcon(iconoSponsor);
           
           i++;
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fondoCabeceraP1 = new javax.swing.JPanel();
        lbl_cabecera = new javax.swing.JLabel();
        pnl_fondoPrincipalP1 = new javax.swing.JPanel();
        lbl_principal = new javax.swing.JLabel();
        pnl_fondoPiep1 = new javax.swing.JPanel();
        lbl_pie1 = new javax.swing.JLabel();
        lbl_pie2 = new javax.swing.JLabel();
        lbl_pie3 = new javax.swing.JLabel();
        lbl_pie4 = new javax.swing.JLabel();
        lbl_pie5 = new javax.swing.JLabel();
        lbl_pie6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartel");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout pnl_fondoCabeceraP1Layout = new javax.swing.GroupLayout(pnl_fondoCabeceraP1);
        pnl_fondoCabeceraP1.setLayout(pnl_fondoCabeceraP1Layout);
        pnl_fondoCabeceraP1Layout.setHorizontalGroup(
            pnl_fondoCabeceraP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoCabeceraP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fondoCabeceraP1Layout.setVerticalGroup(
            pnl_fondoCabeceraP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoCabeceraP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fondoPrincipalP1Layout = new javax.swing.GroupLayout(pnl_fondoPrincipalP1);
        pnl_fondoPrincipalP1.setLayout(pnl_fondoPrincipalP1Layout);
        pnl_fondoPrincipalP1Layout.setHorizontalGroup(
            pnl_fondoPrincipalP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPrincipalP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fondoPrincipalP1Layout.setVerticalGroup(
            pnl_fondoPrincipalP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPrincipalP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fondoPiep1Layout = new javax.swing.GroupLayout(pnl_fondoPiep1);
        pnl_fondoPiep1.setLayout(pnl_fondoPiep1Layout);
        pnl_fondoPiep1Layout.setHorizontalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_pie1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pie2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(lbl_pie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(lbl_pie5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        pnl_fondoPiep1Layout.setVerticalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_pie5, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(lbl_pie2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_pie1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_pie3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_pie4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_pie6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fondoCabeceraP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_fondoPrincipalP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_fondoPiep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_fondoCabeceraP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_fondoPrincipalP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_fondoPiep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_cabecera;
    private javax.swing.JLabel lbl_pie1;
    private javax.swing.JLabel lbl_pie2;
    private javax.swing.JLabel lbl_pie3;
    private javax.swing.JLabel lbl_pie4;
    private javax.swing.JLabel lbl_pie5;
    private javax.swing.JLabel lbl_pie6;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JPanel pnl_fondoCabeceraP1;
    private javax.swing.JPanel pnl_fondoPiep1;
    private javax.swing.JPanel pnl_fondoPrincipalP1;
    // End of variables declaration//GEN-END:variables

    
}
