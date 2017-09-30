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
public class Tesis{
    public static String[] bibliografia;
    public static int longibibliografia=0;
    
    public Tesis(){
        bibliografia=new String[600];
    }
    
   public void setTesis(int tipo, String autor, String titulo, String descripcion, String palcla, 
            int edicion, String temas, String frecuencia, String ejemplares, String area, int copias, 
            int disponibles) {
        
        bibliografia[longibibliografia]=2+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+area+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
        
    }
    
    
    
    
    
    
    
    
    
}
