/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class Usuario_Normal extends javax.swing.JFrame {
DefaultTableModel modelo;
public static String[][] Carga=new String[600][600];
public static int ide;
int columna=0;



    /**
     * Creates new form Usuario_Normal
     */
    public Usuario_Normal() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        
       modelo=new DefaultTableModel();
        modelo.addColumn("No");
        modelo.addColumn("Autor");
        modelo.addColumn("Titulo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Palabras Clave");
        modelo.addColumn("Edicion");
        modelo.addColumn("Temas");
        modelo.addColumn("Frecuencia actual");
        modelo.addColumn("Ejemplares");
        modelo.addColumn("Area");
        modelo.addColumn("Copias");
        modelo.addColumn("Disponible");
        
        this.tabla.setModel(modelo);
        
          int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
    }
    
    private void ordenarCopias() throws Exception{
    
         int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
        String aux;
        boolean cambios=false;
        
        while(true){
            cambios=false;
            for(int i=1;i<Carga.length;i++){
                //10
                String a=Carga[ide][i];
                String b=Carga[ide][i-1];
                String coo1[]=a.split(";");
                String coo2[]=b.split(";");
                int n1=Integer.parseInt(coo1[10]);
                int n2=Integer.parseInt(coo2[10]);
                
                if(n1<n2){
                    aux=Carga[ide][i];
                    Carga[ide][i]=Carga[ide][i-1];
                    Carga[ide][i-1]=aux;
                    cambios=true;
                }
            }
            if(cambios==false){
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Presione Cargar", "Ordenado segun copias", INFORMATION_MESSAGE);
        
    }
    
    public void iden(int i){
        
    ide=i;
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
        txtautor = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpalabraclave = new javax.swing.JTextField();
        btnvolver = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        btnordenar = new javax.swing.JButton();
        btncargar = new javax.swing.JButton();
        btnvirtual = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Autor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Titulo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtautor.setColumns(12);
        getContentPane().add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        txttitulo.setColumns(12);
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Palabra Clave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        btnbuscar.setText("Buscar");
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        txtpalabraclave.setColumns(15);
        getContentPane().add(txtpalabraclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Copias", "Disponible" }));
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        btnordenar.setText("Ordenar");
        btnordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        btncargar.setText("Cargar");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        getContentPane().add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        btnvirtual.setText("Ver Biblioteca Virtual");
        getContentPane().add(btnvirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 880, 220));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1_201602598/Imagenes/f.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        
        boolean msj=false;
     
        
        int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
     
        for(int i=0;i<Bibliografia.longibibliografia;i++){
                 
                 String a=Bibliografia.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][columna]=a;
                     columna++;
                     JOptionPane.showMessageDialog(null, "Se ha cargado el libro \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        //--------------------------------------------------------------------------
        
        for(int i=0;i<Revista.longibibliografia;i++){
                 
                 String a=Revista.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][columna]=a;
                     columna++;
                     JOptionPane.showMessageDialog(null, "Se ha cargado la revista \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        //-----------------------------------------------------------------------------------------
        for(int i=0;i<Tesis.longibibliografia;i++){
                 
                 String a=Tesis.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][columna]=a;
                     columna++;
                     JOptionPane.showMessageDialog(null, "Se ha cargado la tesis \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        if(msj==false){
            JOptionPane.showMessageDialog(null, "No existe este documento");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnagregarActionPerformed

    public void Cargar() throws Exception{
  
        int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
        
        for(int i=0;i<Carga.length;i++){
            
            String aux=Carga[ide][i];
            String[] coo=aux.split(";");
            
            if(!(coo[0].equals(""))){
            modelo.addRow(coo);
        }
            
        }
   
    }
    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        // TODO add your handling code here:
        try{
            Cargar();
        }catch(Exception e){
                
                }
        
    }//GEN-LAST:event_btncargarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Login lo=new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        
        
         boolean msj=false;
     
        
        int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
     
        for(int i=0;i<Bibliografia.longibibliografia;i++){
                 
                 String a=Bibliografia.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][i]="";
                     
                     JOptionPane.showMessageDialog(null, "Se ha eliminado el libro \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        //--------------------------------------------------------------------------
        
        for(int i=0;i<Revista.longibibliografia;i++){
                 
                 String a=Revista.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][i]="";
                     
                     JOptionPane.showMessageDialog(null, "Se ha eliminado la revista \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        //-----------------------------------------------------------------------------------------
        for(int i=0;i<Tesis.longibibliografia;i++){
                 
                 String a=Tesis.bibliografia[i];
                 String[] coo=a.split(";");
                 
                 if(txtautor.getText().equals(coo[1])&&(txttitulo.getText().equals(coo[2]))){
                     
                     Carga[ide][i]="";
                     
                     JOptionPane.showMessageDialog(null, "Se ha eliminado la tesis \n"+coo[1]);
                     msj=true;
                     break;
                     
                 }
                 
        }//for
        
        if(msj==false){
            JOptionPane.showMessageDialog(null, "No existe este documento");
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btneliminarActionPerformed
    
    private void imp() throws Exception{
        
         int cantidadfilas=tabla.getRowCount();
        for(int j=cantidadfilas-1;j>=0;j--){
            modelo.removeRow(j);
        }
        
          
        for(int i=0;i<Carga.length;i++){
            
            String aux=Carga[ide][i];
            String[] coo=aux.split(";");
            
            if(!(coo[0].equals(""))){
            modelo.addRow(coo);
        }
            
        }//for
        
    }
    private void btnordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenarActionPerformed
        // TODO add your handling code here:
       try{
        ordenarCopias();
       }catch(Exception e){
           
       }
   
        
  
        
      
        
    }//GEN-LAST:event_btnordenarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnordenar;
    private javax.swing.JButton btnvirtual;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtpalabraclave;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
