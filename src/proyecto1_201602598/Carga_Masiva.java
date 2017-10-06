/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class Carga_Masiva extends javax.swing.JFrame {
public java.io.File fichero;
DefaultTableModel modelo;
    /**
     * Creates new form Carga_Masiva
     */
    public Carga_Masiva() {
        initComponents();
        
        
         this.setLocationRelativeTo(null);
        Llenar();
        
        
        
        
        
        
        
        
    }
    public void cargar(){
        int contador=1;
        JFileChooser buscador=new JFileChooser();
        buscador.showOpenDialog(buscador);
        
        try{
            String holaaa=buscador.getSelectedFile().getAbsolutePath();
            FileInputStream archivo=new FileInputStream(holaaa);
            DataInputStream entrada= new DataInputStream(archivo);
            
            BufferedReader buffer=new BufferedReader(new InputStreamReader(entrada));
            String lineas;
            
            while((lineas=buffer.readLine())!=null){
                if(contador!=0){
                    String[] informacion;
                    informacion=lineas.split(";");
                    //-------
                        for(int i=0;i<informacion.length;i++){
                    if(informacion[i]==null){
                        informacion[i]="";
                    }
                }
                switch(informacion[0]){
                    case("0"):
                
                 Bibliografia.setBibliografiaM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                 
                    case("1"):
                        Revista.setRevistaM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                 
                    case("2"):
                        Tesis.setTesisM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                
                } 
                    //-------
                }
                contador++;
            }
            entrada.close();
        }catch(Exception e){
            
        }
        
    }
    private String abrirCSV()
    {
        String cadena="";
        int seleccion = fileCh.showDialog(this,"Seleccionar archivo csv");
        if(seleccion == javax.swing.JFileChooser.APPROVE_OPTION)
        {
            fichero = fileCh.getSelectedFile();
            cadena = fichero.getAbsolutePath();
        }
        return cadena;
    }
    
     private String parsearCSV(String ruta)
    {
       
        String cadena=""; 
      // String fileName="este.csv";
        File file=new File(ruta);
        
        try{
            Scanner inputStream=new Scanner(file);
            while(inputStream.hasNext()){
                String data=inputStream.next();
                String[] informacion=data.split(";");
                for(int i=0;i<informacion.length;i++){
                    if(informacion[i]==null){
                        informacion[i]="";
                    }
                }
                switch(informacion[0]){
                    case("0"):
                
                 Bibliografia.setBibliografiaM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                 
                    case("1"):
                        Revista.setRevistaM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                 
                    case("2"):
                        Tesis.setTesisM(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5], informacion[6], informacion[7], informacion[8],informacion[9], informacion[10], informacion[11]);
                 break;
                
                }    
                //System.out.println(data);
                
            }
        inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return cadena;
        
    }
     
     private void Llenar(){
         
         
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
        
        
        
        for(int i=0;i<Bibliografia.longibibliografia;i++){
            String aux=new String(Bibliografia.bibliografia[i]);
            String[] coo=aux.split(";");
            
            if(!(coo[0].equals(""))){
            modelo.addRow(coo);
        }
            
        }
        
        
        for(int x=0;x<Revista.longibibliografia;x++){
            String aux=new String(Revista.bibliografia[x]);
            String[] coo=aux.split(";");
            if(!(coo[0].equals(""))){
            modelo.addRow(coo);
        }
            
        }
        
        for(int y=0;y<Tesis.longibibliografia;y++){
            String aux=new String(Tesis.bibliografia[y]);
            String[] coo=aux.split(";");
            if(!(coo[0].equals(""))){
            modelo.addRow(coo);
        }
            
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

        fileCh = new javax.swing.JFileChooser();
        lblcargamasiva = new javax.swing.JLabel();
        btncargar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcargamasiva.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblcargamasiva.setForeground(new java.awt.Color(204, 204, 0));
        lblcargamasiva.setText("Carga Masiva");
        getContentPane().add(lblcargamasiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btncargar.setText("Cargar Informacion");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        getContentPane().add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 960, 260));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1_201602598/Imagenes/f.jpg"))); // NOI18N
        lblfondo.setText("Carga MAsiva");
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        // TODO add your handling code here:
        //String cadena = this.parsearCSV(abrirCSV());
        //System.out.println(cadena);
        cargar();
        Llenar();
    }//GEN-LAST:event_btncargarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Usuario_Administrador ua=new Usuario_Administrador();
        this.setVisible(false);
        ua.setVisible(true);
        
    }//GEN-LAST:event_btnvolverActionPerformed

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
            java.util.logging.Logger.getLogger(Carga_Masiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga_Masiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga_Masiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga_Masiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga_Masiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JFileChooser fileCh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcargamasiva;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
