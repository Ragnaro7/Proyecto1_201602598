/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class Leer_Archivo {
    
    
    public static void Presentar(){
        
        try{
            FileInputStream archivo=new FileInputStream("prueba.txt");
            DataInputStream entrada=new DataInputStream(archivo);
            BufferedReader buffer=new BufferedReader(new InputStreamReader(entrada));
            String lineas;
            
            while((lineas=buffer.readLine())!=null){
                System.out.println(lineas);
            }
            entrada.close();
            
        }catch(Exception e){
            System.out.println("Ocurrio un error"+e.getMessage());
        }
        
    }
    
    public static void leer(){
        
        String fileName="este.csv";
        File file=new File(fileName);
        
        try{
            Scanner inputStream=new Scanner(file);
            while(inputStream.hasNext()){
                String data=inputStream.next();
                data.split(";");
                
                System.out.println(data);
                
            }
        inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        
    }
    
    
    
    
    
}
