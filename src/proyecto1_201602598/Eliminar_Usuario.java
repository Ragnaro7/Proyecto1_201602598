/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class Eliminar_Usuario extends javax.swing.JFrame {

    int k;
    /**
     * Creates new form Eliminar_Usuario
     */
    public Eliminar_Usuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtrol = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtcpass = new javax.swing.JPasswordField();
        btnbuscar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Eliminar Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel6.setText("Confirmar Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel7.setText("Rol");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel8.setText("User");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtid.setColumns(12);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, -1));

        txtapellido.setColumns(12);
        txtapellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtapellido.setEnabled(false);
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        txtnombre.setBackground(new java.awt.Color(240, 240, 240));
        txtnombre.setColumns(12);
        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtnombre.setEnabled(false);
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtrol.setColumns(12);
        txtrol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtrol.setEnabled(false);
        getContentPane().add(txtrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        txtuser.setColumns(12);
        txtuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtuser.setEnabled(false);
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtpass.setColumns(12);
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpass.setEnabled(false);
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txtcpass.setColumns(12);
        txtcpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcpass.setEnabled(false);
        getContentPane().add(txtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        btncancelar.setText("Cancelar");
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1_201602598/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 310, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Usuario_Administrador ua=new Usuario_Administrador();
        ua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
            
        boolean msj=false;
        
        for(int i=0;i<Proyecto1_201602598.longi;i++){
            
            String a=new String(Proyecto1_201602598.usuario[i]);
            String coordenadas[]=a.split(",");
            
            if(txtid.getText().equals(coordenadas[0])){
                txtnombre.setText(coordenadas[1]);
                 txtapellido.setText(coordenadas[2]);
                  txtuser.setText(coordenadas[3]);
                   txtrol.setText(coordenadas[4]);
                    txtpass.setText(coordenadas[5]);
                     txtcpass.setText(coordenadas[5]);
                     k=i;
                     msj=true;
                            
            }/*else{
                JOptionPane.showMessageDialog(null, "Este usuario no existe");
                
            }*/
            
        } //for
        
        if(msj==false){
            JOptionPane.showMessageDialog(null, "Este usuario no existe");
                
        }
        
       // nombre,apellido,user,rol
         // String valores=sc.nextLine();
           // String coordenadas[]=valores.split(",");
                  
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Usuario.setUsuario(k);
        
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtrol;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
