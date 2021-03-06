/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javax.swing.JDesktopPane;

/**
 *
 * @author Miguel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnu_programa = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        mnu_sponsor = new javax.swing.JMenu();
        mnuit_crearSponsor = new javax.swing.JMenuItem();
        mnuit_verSponsor = new javax.swing.JMenuItem();
        mnu_cartel = new javax.swing.JMenu();
        mnuit_crearCartel = new javax.swing.JMenuItem();
        mnuit_verCartel = new javax.swing.JMenuItem();
        mnu_ayuda = new javax.swing.JMenu();
        mnuit_acercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnu_programa.setMnemonic('f');
        mnu_programa.setText("Programa");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mnu_programa.add(exitMenuItem);

        menuBar.add(mnu_programa);

        mnu_sponsor.setMnemonic('e');
        mnu_sponsor.setText("Sponsor");

        mnuit_crearSponsor.setMnemonic('t');
        mnuit_crearSponsor.setText("Crear");
        mnu_sponsor.add(mnuit_crearSponsor);

        mnuit_verSponsor.setMnemonic('y');
        mnuit_verSponsor.setText("Ver");
        mnu_sponsor.add(mnuit_verSponsor);

        menuBar.add(mnu_sponsor);

        mnu_cartel.setMnemonic('h');
        mnu_cartel.setText("Cartel");

        mnuit_crearCartel.setMnemonic('c');
        mnuit_crearCartel.setText("Crear");
        mnuit_crearCartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuit_crearCartelActionPerformed(evt);
            }
        });
        mnu_cartel.add(mnuit_crearCartel);

        mnuit_verCartel.setText("Ver");
        mnuit_verCartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuit_verCartelActionPerformed(evt);
            }
        });
        mnu_cartel.add(mnuit_verCartel);

        menuBar.add(mnu_cartel);

        mnu_ayuda.setText("Ayuda");

        mnuit_acercaDe.setMnemonic('a');
        mnuit_acercaDe.setText("Acerca de ");
        mnu_ayuda.add(mnuit_acercaDe);

        menuBar.add(mnu_ayuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnuit_crearCartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuit_crearCartelActionPerformed
         CrearCartel crearCartel = new CrearCartel();
        desktopPane.add(crearCartel);
        crearCartel.show();
    }//GEN-LAST:event_mnuit_crearCartelActionPerformed

    private void mnuit_verCartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuit_verCartelActionPerformed
        VerCarteles verCarteles = new VerCarteles();
        desktopPane.add(verCarteles);
        verCarteles.show();
       // System.out.println("Dentro de ver carteles");
    }//GEN-LAST:event_mnuit_verCartelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnu_ayuda;
    private javax.swing.JMenu mnu_cartel;
    private javax.swing.JMenu mnu_programa;
    private javax.swing.JMenu mnu_sponsor;
    private javax.swing.JMenuItem mnuit_acercaDe;
    private javax.swing.JMenuItem mnuit_crearCartel;
    private javax.swing.JMenuItem mnuit_crearSponsor;
    private javax.swing.JMenuItem mnuit_verCartel;
    private javax.swing.JMenuItem mnuit_verSponsor;
    // End of variables declaration//GEN-END:variables

}
