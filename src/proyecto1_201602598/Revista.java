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
public class Revista extends Bibliografia {
    
    
    
    
    
    
public void setRevista(String autor,String titulo,int edicion,String palcla,String descripcion,
        String temas,int copias,int disponibles,String frecuencia,int ejemplares){
    
    bibliografia[longibibliografia]=autor+";"+titulo+";"+edicion+";"+palcla+";"+descripcion+";"+temas
            +";"+copias+";"+disponibles+";"+frecuencia+";"+ejemplares;
    //this.aumentarLongi();
    longibibliografia++;
    
}
    
    
    
    
    
}
