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
    public static String[] bibliografia=new String[600];
    public static int longibibliografia=0;
    
    public Tesis(){
        //bibliografia=new String[600];
    }
    
    public static void setTesis(int po){
    bibliografia[po]="";
}
    
    public static void setTesisM(String tipo, String autor, String titulo, String descripcion, String palcla, 
            String edicion, String temas, String frecuencia, String ejemplares, String area, String copias, 
            String disponibles) {
        
        bibliografia[longibibliografia]=tipo+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+area+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
        
    }
    
    
   public static void setTesis(int tipo, String autor, String titulo, String descripcion, String palcla, 
            String edicion, String temas, String frecuencia, String ejemplares, String area, String copias, 
            String disponibles) {
        
        bibliografia[longibibliografia]=2+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+area+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
        
    }
    
   public static void setTesis(int po,int tipo, String autor, String titulo, String descripcion, String palcla, 
            String edicion, String temas, String frecuencia, String ejemplares, String area, String copias, 
            String disponibles) {
        
        bibliografia[po]=2+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+area+";"+copias+";"+disponibles;
   
        
    } 
    
    
    
    
    
    
    
}
