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
public class Carga_Individual extends javax.swing.JFrame {
/*Bibliografia b=new Bibliografia(); 
Revista r=new Revista();
Tesis t=new Tesis();*/
    /**
     * Creates new form Carga_Individual
     */
    public Carga_Individual() {
        initComponents();
        this.setLocationRelativeTo(null);
         
    }
    
    private void limpiar(){
        txtarea.setText(null);
        txtautor.setText(null);
        txtcopias.setText(null);
        txtdescripcion.setText(null);
        txtdisponible.setText(null);
        txtedicion.setText(null);
        txtejemplares.setText(null);
        txtfrecuencia.setText(null);
        txtpalabrasclave.setText(null);
        txttemas.setText(null);
        txttitulo.setText(null);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        txtedicion = new javax.swing.JTextField();
        txtautor = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtpalabrasclave = new javax.swing.JTextField();
        txtdisponible = new javax.swing.JTextField();
        txtcopias = new javax.swing.JTextField();
        txtarea = new javax.swing.JTextField();
        txtejemplares = new javax.swing.JTextField();
        txtfrecuencia = new javax.swing.JTextField();
        txttemas = new javax.swing.JTextField();
        btncargar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Carga Individual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Tipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Autor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Titulo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setText("Descripcion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setText("Palabras Clave");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setText("Edicion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel8.setText("Temas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel9.setText("Frecuencia actual");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel10.setText("Ejemplares");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel11.setText("Area");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel12.setText("Copias");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 20));

        jLabel13.setText("Disponible");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis" }));
        getContentPane().add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        txtedicion.setColumns(12);
        getContentPane().add(txtedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        txtautor.setColumns(12);
        getContentPane().add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txttitulo.setColumns(12);
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        txtdescripcion.setColumns(12);
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtpalabrasclave.setColumns(12);
        getContentPane().add(txtpalabrasclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        txtdisponible.setColumns(12);
        getContentPane().add(txtdisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        txtcopias.setColumns(12);
        getContentPane().add(txtcopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        txtarea.setColumns(12);
        getContentPane().add(txtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        txtejemplares.setColumns(12);
        getContentPane().add(txtejemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        txtfrecuencia.setColumns(12);
        getContentPane().add(txtfrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txttemas.setColumns(12);
        getContentPane().add(txttemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        btncargar.setText("Cargar");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        getContentPane().add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        btncancelar.setText("Cancelar");
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 30));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1_201602598/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Crear_Bibliografia cb=new Crear_Bibliografia();
        cb.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        // TODO add your handling code here:
     
        int indice=combotipo.getSelectedIndex();
       //  Libro libro=new Libro();
      
       switch(indice){
            case(0): 
                //Libro libro=new Libro();
               // int r=Integer.parseInt(txtedicion.getText());
                
                /*String a=txtpalabrasclave.getText();
                String[] palcla1=a.split(",");
                String g=txttemas.getText();
                String[] temas=g.split(",");*/
           
                /*txtfrecuencia.setEditable(false);
                txtarea.setEditable(false);
                txtejemplares.setEditable(false);
                txtfrecuencia.setEnabled(false);*/
                Bibliografia.setBibliografia("0",txtautor.getText(), txttitulo.getText(), txtdescripcion.getText(),
                        txtpalabrasclave.getText(),txtedicion.getText(),txttemas.getText(),"","","",
                        txtcopias.getText(), 
                        txtdisponible.getText());
                
                
                /*
    bibliografia[longibibliografia]=0+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+""+";"+copias+";"+disponibles;*/
                
                JOptionPane.showMessageDialog(null, "Libro Cargado");
                Limpiar();
                break;
                    
                
            case(1):
                
                //txtarea.setEditable(false);
                Revista.setRevista(1,txtautor.getText(), txttitulo.getText(), txtdescripcion.getText(),
                        txtpalabrasclave.getText(),txtedicion.getText(),txttemas.getText(),
                        txtfrecuencia.getText(),
                        txtejemplares.getText(),"",
                        txtcopias.getText(), 
                        txtdisponible.getText());
                
                JOptionPane.showMessageDialog(null, "Revista Cargada");
                Limpiar();
                break;
                
            
            case(2):
                
                Tesis.setTesis(2,txtautor.getText(), txttitulo.getText(), txtdescripcion.getText(),
                        txtpalabrasclave.getText(),txtedicion.getText(),txttemas.getText(),
                         
                        "", "",txtarea.getText(),txtcopias.getText(),
                        txtdisponible.getText());
                
                JOptionPane.showMessageDialog(null, "Tesis Cargada");
                Limpiar();
                break;
                
                
                
        }
        
    
        
    }//GEN-LAST:event_btncargarActionPerformed

    public void Limpiar(){
        txttitulo.setText(null);
                txtarea.setText(null);
                txtautor.setText(null);
                txtcopias.setText(null);
                txtdescripcion.setText(null);
                txtdisponible.setText(null);
                txtedicion.setText(null);
                txtejemplares.setText(null);
                txtfrecuencia.setText(null);
                        txtpalabrasclave.setText(null);
                 txttemas.setText(null);
                 
    }
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
            java.util.logging.Logger.getLogger(Carga_Individual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga_Individual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga_Individual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga_Individual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga_Individual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtarea;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtcopias;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdisponible;
    private javax.swing.JTextField txtedicion;
    private javax.swing.JTextField txtejemplares;
    private javax.swing.JTextField txtfrecuencia;
    private javax.swing.JTextField txtpalabrasclave;
    private javax.swing.JTextField txttemas;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
