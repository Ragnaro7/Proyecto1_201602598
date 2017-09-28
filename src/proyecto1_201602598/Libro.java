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
public class Libro extends Bibliografia{
    
    private static int longilibro=0;
    public Libro(){
        super();
        super.setLongi(longilibro);
        
    }
    
    
    public int lon(){
        return longilibro;
    }
}
