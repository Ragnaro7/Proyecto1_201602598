/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

/**
 *
 * @author Hector
 */
public class Usuario_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_Administrador
     */
    public Usuario_Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuarios = new javax.swing.JLabel();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnver = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        btncrear1 = new javax.swing.JButton();
        btnmodificar1 = new javax.swing.JButton();
        btneliminar1 = new javax.swing.JButton();
        btnver1 = new javax.swing.JButton();
        Bibliografica = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblusuarios.setText("Usuarios");
        getContentPane().add(lblusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        getContentPane().add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        btnver.setText("Ver");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        getContentPane().add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        btncrear1.setText("Crear");
        btncrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnmodificar1.setText("Modificar");
        getContentPane().add(btnmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        btneliminar1.setText("Eliminar");
        getContentPane().add(btneliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        btnver1.setText("Ver");
        getContentPane().add(btnver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        Bibliografica.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bibliografica.setText("Bibliografia");
        getContentPane().add(Bibliografica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1_201602598/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Crear_Usuario cu=new Crear_Usuario();
        cu.setVisible(true);
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        // TODO add your handling code here:
        Ver_Usuarios vu=new Ver_Usuarios();
        this.setVisible(false);
        vu.setVisible(true);
        
    }//GEN-LAST:event_btnverActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Eliminar_Usuario eu=new Eliminar_Usuario();
        eu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        Modificar_Usuario mu=new Modificar_Usuario();
        mu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrear1ActionPerformed
        // TODO add your handling code here:
        
        Crear_Bibliografia cb=new Crear_Bibliografia();
        cb.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btncrear1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bibliografica;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btncrear1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminar1;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmodificar1;
    private javax.swing.JButton btnver;
    private javax.swing.JButton btnver1;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblusuarios;
    // End of variables declaration//GEN-END:variables
}
