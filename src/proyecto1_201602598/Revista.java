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
public class Revista{
    
    public static String[] bibliografia=new String[600];
    public static int longibibliografia=0;
    
    public Revista(){
        
        //bibliografia=new String[600];
    
    }
    
public static void setRevista(int po){
    bibliografia[po]="";
}
    public static void setRevista(int tipo, String autor, String titulo, String descripcion, String palcla, 
            String edicion, String temas, String frecuencia, String ejemplares, String area, String copias, 
            String disponibles) {
        
        bibliografia[longibibliografia]=1+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+frecuencia+";"+ejemplares+";"+""+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
        
    }
    
    public static void setRevista(int po,int tipo, String autor, String titulo, String descripcion, String palcla, 
            String edicion, String temas, String frecuencia, String ejemplares, String area, String copias, 
            String disponibles) {
        
        bibliografia[po]=1+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+frecuencia+";"+ejemplares+";"+""+";"+copias+";"+disponibles;
  
    
        
    }
    
    
/*public void setRevista(String autor,String titulo,int edicion,String palcla,String descripcion,
        String temas,int copias,int disponibles,String frecuencia,int ejemplares){
    
    bibliografia[longibibliografia]=autor+";"+titulo+";"+edicion+";"+palcla+";"+descripcion+";"+temas
            +";"+copias+";"+disponibles+";"+frecuencia+";"+ejemplares;
    //this.aumentarLongi();
    longibibliografia++;
    
}*/
    
    
    
    
    
}
