/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import logica.MostrarCartel;

/**
 *
 * @author Miguel
 */
public class VerCarteles extends javax.swing.JInternalFrame {

    /**
     * Creates new form VerCarteles
     */
    public VerCarteles() {
        initComponents();
        listarCarteles();
        btn_ver.setEnabled(false);
    }

    /*
    Lista los carteles en un jlist(lo hago en principio con un array list 
    metiendo los datos a pelo. habria que cogerlos de la base de datos.
     */
    private void listarCarteles() {

        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("cartel1");
        modelo.addElement("cartel2");
        modelo.addElement("cartel3");
        modelo.addElement("cartel4");
        modelo.addElement("cartel5");
        modelo.addElement("cartel6");

        lst_nombresCarteles.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_nombresCarteles = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cbo_tipoPlantilla = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lbl_imagenPlantilla = new javax.swing.JLabel();
        btn_ver = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Carteles");

        lst_nombresCarteles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_nombresCarteles);

        jLabel1.setText("Listado de carteles");

        cbo_tipoPlantilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo1", "Tipo2" }));
        cbo_tipoPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipoPlantillaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Plantilla: ");

        lbl_imagenPlantilla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_ver.setText("Ver");
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_imagenPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_tipoPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_tipoPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(lbl_imagenPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ver, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_tipoPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipoPlantillaActionPerformed
        switch (cbo_tipoPlantilla.getSelectedIndex()) {
            case 0: {
                ImageIcon imagenPlantilla = new ImageIcon("imagenesplantillas/tipo1.PNG");
                Icon icon0;
                icon0 = new ImageIcon(imagenPlantilla.getImage().getScaledInstance(
                        lbl_imagenPlantilla.getWidth(), lbl_imagenPlantilla.getHeight(),
                        Image.SCALE_DEFAULT));

                lbl_imagenPlantilla.setIcon(icon0);
                break;
            }
            case 1:
                ImageIcon imagenPlantilla = new ImageIcon("imagenesplantillas/tipo2.PNG");
                Icon icon1;
                icon1 = new ImageIcon(imagenPlantilla.getImage().getScaledInstance(
                        lbl_imagenPlantilla.getWidth(), lbl_imagenPlantilla.getHeight(),
                        Image.SCALE_DEFAULT));

                lbl_imagenPlantilla.setIcon(icon1);
                break;
        }
        btn_ver.setEnabled(true);
    }//GEN-LAST:event_cbo_tipoPlantillaActionPerformed

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed
        // si est� seleccionado un cartel lo mostramos
        if (!lst_nombresCarteles.isSelectionEmpty() &&  
                cbo_tipoPlantilla.getSelectedIndex()!= -1) {

            new MostrarCartel(lst_nombresCarteles.getSelectedValue(),
                    cbo_tipoPlantilla.getSelectedIndex());
        }
    }//GEN-LAST:event_btn_verActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ver;
    private javax.swing.JComboBox<String> cbo_tipoPlantilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_imagenPlantilla;
    private javax.swing.JList<String> lst_nombresCarteles;
    // End of variables declaration//GEN-END:variables

}
