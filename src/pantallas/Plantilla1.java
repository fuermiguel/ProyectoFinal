/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Plantilla1 extends javax.swing.JFrame {

    private String fndCabecera, imgCabecera,
            fndPrincipal, imgPrincipal, fndPie;

    /**
     * Creates new form MostrarPlantillas
     */
    public Plantilla1(String fndCabecera, String imgCabecera,
            String fndPrincipal, String imgPrincipal, String fndPie) {
        initComponents();
        this.fndCabecera = fndCabecera;
        this.imgCabecera = imgCabecera;
        this.fndPrincipal = fndPrincipal;
        this.imgPrincipal = imgPrincipal;
        this.fndPie = fndPie;
        rellenarComponentes();
    }
    
    private void rellenarComponentes() {
         pnl_fondoCabeceraP1.setBackground(Color.BLUE);
         pnl_fondoPrincipalP1.setBackground(Color.BLUE);
         pnl_fondoPiep1.setForeground(Color.BLUE);
         
        ImageIcon cabecera = new ImageIcon("imagenes/"+ imgCabecera);
        Icon iconoCabecera = new ImageIcon(cabecera.getImage().getScaledInstance(
                 lbl_cabecera.getWidth(), lbl_cabecera.getHeight(),
                Image.SCALE_DEFAULT));
        lbl_cabecera.setIcon(iconoCabecera);
                 
         ImageIcon principal = new ImageIcon("imagenes/" + imgPrincipal);
         Icon iconoPrincipal = new ImageIcon(principal.getImage().getScaledInstance(
                 lbl_principal.getWidth(), lbl_principal.getHeight(),
                Image.SCALE_DEFAULT));
        
        lbl_principal.setIcon(iconoPrincipal);
         
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
        lbl_pie = new javax.swing.JLabel();
        lbl_pie1 = new javax.swing.JLabel();
        lbl_pie2 = new javax.swing.JLabel();
        lbl_pie3 = new javax.swing.JLabel();
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
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fondoPrincipalP1Layout.setVerticalGroup(
            pnl_fondoPrincipalP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoPrincipalP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_pie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_pie6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_fondoPiep1Layout = new javax.swing.GroupLayout(pnl_fondoPiep1);
        pnl_fondoPiep1.setLayout(pnl_fondoPiep1Layout);
        pnl_fondoPiep1Layout.setHorizontalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoPiep1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lbl_pie, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lbl_pie5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lbl_pie2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lbl_pie3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lbl_pie1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lbl_pie6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnl_fondoPiep1Layout.setVerticalGroup(
            pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoPiep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fondoPiep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_pie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_pie5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(lbl_pie2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(lbl_pie3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(lbl_pie1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(lbl_pie6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fondoPrincipalP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_fondoCabeceraP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnl_fondoPiep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_cabecera;
    private javax.swing.JLabel lbl_pie;
    private javax.swing.JLabel lbl_pie1;
    private javax.swing.JLabel lbl_pie2;
    private javax.swing.JLabel lbl_pie3;
    private javax.swing.JLabel lbl_pie5;
    private javax.swing.JLabel lbl_pie6;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JPanel pnl_fondoCabeceraP1;
    private javax.swing.JPanel pnl_fondoPiep1;
    private javax.swing.JPanel pnl_fondoPrincipalP1;
    // End of variables declaration//GEN-END:variables

    
}
