/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Miguel
 */
public class CrearCartel extends javax.swing.JInternalFrame {

    DefaultListModel modelo;

    /**
     * Creates new form CrearCartel
     */
    public CrearCartel() {
        initComponents();
        llenarComboSoponsors();
        generarModeloListaSponsors();
    }

    private void generarModeloListaSponsors() {
        modelo = new DefaultListModel();
    }

    private void llenarComboSoponsors() {
        cbx_seleccionarSponsor.addItem("adidas.png");
        cbx_seleccionarSponsor.addItem("cocacola.png");
        cbx_seleccionarSponsor.addItem("rebook.png");
        cbx_seleccionarSponsor.addItem("redbull.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        btn_elegirArchivo = new javax.swing.JButton();
        btn_anadirCabecera = new javax.swing.JButton();
        btn_anadirPrincipal = new javax.swing.JButton();
        btn_anadirPie = new javax.swing.JButton();
        txt_cabecera = new javax.swing.JTextField();
        btn_principal = new javax.swing.JTextField();
        btn_pie = new javax.swing.JTextField();
        cbx_seleccionarSponsor = new javax.swing.JComboBox<>();
        lbl_PrevisualizarSponsor = new javax.swing.JLabel();
        btn_anadirSponsor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_sponsorsSelecionados = new javax.swing.JList<>();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_colorFondo = new javax.swing.JButton();
        txt_colorFondo = new javax.swing.JTextField();
        btn_quitarEsponsorLista = new javax.swing.JButton();

        fileChooser.setFileFilter(new MiFiltro());

        setClosable(true);
        setIconifiable(true);
        setTitle("Crear cartel");

        btn_elegirArchivo.setText("Elegir Archivo");
        btn_elegirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegirArchivoActionPerformed(evt);
            }
        });

        btn_anadirCabecera.setText("A�adir Cabecera");

        btn_anadirPrincipal.setText("A�adir Principal");

        btn_anadirPie.setText("A�adir Pie");

        cbx_seleccionarSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_seleccionarSponsorActionPerformed(evt);
            }
        });

        lbl_PrevisualizarSponsor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PrevisualizarSponsor.setText("Previsualizar imagen");
        lbl_PrevisualizarSponsor.setAlignmentY(0.0F);
        lbl_PrevisualizarSponsor.setBorder(new javax.swing.border.MatteBorder(null));
        lbl_PrevisualizarSponsor.setPreferredSize(new java.awt.Dimension(98, 94));

        btn_anadirSponsor.setText(">");
        btn_anadirSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadirSponsorActionPerformed(evt);
            }
        });

        lst_sponsorsSelecionados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(lst_sponsorsSelecionados);

        btn_guardar.setText("Guardar");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_colorFondo.setText("Color del Fondo");
        btn_colorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorFondoActionPerformed(evt);
            }
        });

        btn_quitarEsponsorLista.setText("<");
        btn_quitarEsponsorLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarEsponsorListaActionPerformed(evt);
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
                        .addComponent(btn_elegirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_anadirCabecera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_anadirPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_anadirPie, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_seleccionarSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_PrevisualizarSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_anadirSponsor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_quitarEsponsorLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_principal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pie, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_colorFondo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salir))
                    .addComponent(txt_colorFondo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cabecera))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_elegirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anadirCabecera)
                            .addComponent(txt_cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anadirPrincipal)
                            .addComponent(btn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anadirPie)
                            .addComponent(btn_pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbx_seleccionarSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_PrevisualizarSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_anadirSponsor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_quitarEsponsorLista))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_colorFondo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_colorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar)
                            .addComponent(btn_salir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_colorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorFondoActionPerformed

    }//GEN-LAST:event_btn_colorFondoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_elegirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegirArchivoActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            txt_cabecera.setText(file.getAbsolutePath());

        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btn_elegirArchivoActionPerformed

    private void cbx_seleccionarSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_seleccionarSponsorActionPerformed
        lbl_PrevisualizarSponsor.setSize(94, 94);
        ImageIcon imagenSponsor = new ImageIcon("ImagenesEsponsors/" + cbx_seleccionarSponsor.getSelectedItem());
        Icon iconoSponsor;
        iconoSponsor = new ImageIcon(imagenSponsor.getImage().getScaledInstance(
                lbl_PrevisualizarSponsor.getWidth(), lbl_PrevisualizarSponsor.getHeight(),
                Image.SCALE_DEFAULT));

        lbl_PrevisualizarSponsor.setIcon(iconoSponsor);
    }//GEN-LAST:event_cbx_seleccionarSponsorActionPerformed

    private void btn_anadirSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadirSponsorActionPerformed
        if (cbx_seleccionarSponsor.getSelectedIndex() != -1) {
            modelo.addElement(cbx_seleccionarSponsor.getSelectedItem());
           lst_sponsorsSelecionados.setModel(modelo);
        }
    }//GEN-LAST:event_btn_anadirSponsorActionPerformed

    private void btn_quitarEsponsorListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarEsponsorListaActionPerformed
         if (!lst_sponsorsSelecionados.isSelectionEmpty()) {
            modelo.removeElement(lst_sponsorsSelecionados.getSelectedValue());
           lst_sponsorsSelecionados.setModel(modelo);
        }
    }//GEN-LAST:event_btn_quitarEsponsorListaActionPerformed
    class MiFiltro extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.png)";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anadirCabecera;
    private javax.swing.JButton btn_anadirPie;
    private javax.swing.JButton btn_anadirPrincipal;
    private javax.swing.JButton btn_anadirSponsor;
    private javax.swing.JButton btn_colorFondo;
    private javax.swing.JButton btn_elegirArchivo;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField btn_pie;
    private javax.swing.JTextField btn_principal;
    private javax.swing.JButton btn_quitarEsponsorLista;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbx_seleccionarSponsor;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_PrevisualizarSponsor;
    private javax.swing.JList<String> lst_sponsorsSelecionados;
    private javax.swing.JTextField txt_cabecera;
    private javax.swing.JTextField txt_colorFondo;
    // End of variables declaration//GEN-END:variables
}
