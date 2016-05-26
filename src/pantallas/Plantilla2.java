/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Miguel
 */
public class Plantilla2 extends JFrame{

    private String fndCabecera, imgCabecera,
            fndPrincipal, imgPrincipal, fndPie;
    private List<String> sponsors;

    /**
     * Creates new form MostrarPlantillas
     */
    public Plantilla2(String fndCabecera, String imgCabecera,
            String fndPrincipal, String imgPrincipal, String fndPie, List<String> sponsors) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.fndCabecera = fndCabecera;
        this.imgCabecera = imgCabecera;
        this.fndPrincipal = fndPrincipal;
        this.imgPrincipal = imgPrincipal;
        this.fndPie = fndPie;
        this.sponsors = sponsors;
        rellenarComponentes();
    }
    
    private void rellenarComponentes() {
        //Color de los fondos
         pnl_fondoCabeceraP1.setBackground(Color.BLUE);
         pnl_fondoPrincipalP1.setBackground(Color.BLUE);
         pnl_fondoPiep1.setBackground(Color.BLUE);
      
        //Imgaen Cabecera 
        ImageIcon cabecera = new ImageIcon("imagenes/"+ imgCabecera);
        Icon iconoCabecera = new ImageIcon(cabecera.getImage().getScaledInstance(
                 lbl_cabecera.getWidth(), lbl_cabecera.getHeight(),
                Image.SCALE_DEFAULT));
        lbl_cabecera.setIcon(iconoCabecera);
        
        //Imagen Principal
         ImageIcon principal = new ImageIcon("imagenes/" + imgPrincipal);
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
        for(String sponsor : sponsors){          
         ImageIcon imagenSponsor = new ImageIcon("imagenes/" + sponsor);
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

        pnl_fondoCabeceraP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_cabecera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_fondoCabeceraP1Layout = new javax.swing.GroupLayout(pnl_fondoCabeceraP1);
        pnl_fondoCabeceraP1.setLayout(pnl_fondoCabeceraP1Layout);
        pnl_fondoCabeceraP1Layout.setHorizontalGroup(
            pnl_fondoCabeceraP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoCabeceraP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fondoCabeceraP1Layout.setVerticalGroup(
            pnl_fondoCabeceraP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoCabeceraP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_fondoPrincipalP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_fondoPrincipalP1Layout = new javax.swing.GroupLayout(pnl_fondoPrincipalP1);
        pnl_fondoPrincipalP1.setLayout(pnl_fondoPrincipalP1Layout);
        pnl_fondoPrincipalP1Layout.setHorizontalGroup(
            pnl_fondoPrincipalP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPrincipalP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fondoPrincipalP1Layout.setVerticalGroup(
            pnl_fondoPrincipalP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPrincipalP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_fondoPiep1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_fondoPiep1Layout = new javax.swing.GroupLayout(pnl_fondoPiep1);
        pnl_fondoPiep1.setLayout(pnl_fondoPiep1Layout);
        pnl_fondoPiep1Layout.setHorizontalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                        .addComponent(lbl_pie1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_pie2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                        .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_pie3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lbl_pie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_pie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnl_fondoPiep1Layout.setVerticalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPiep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pie2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(lbl_pie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pie3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(lbl_pie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pie5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lbl_pie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fondoCabeceraP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_fondoPrincipalP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_fondoPiep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_fondoCabeceraP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_fondoPrincipalP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pnl_fondoPiep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
