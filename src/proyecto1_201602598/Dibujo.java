/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602598;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hector
 */
public class Dibujo extends JFrame{
  
    public Dibujo(int i){
        setTitle("Biblioteca Virtual");
        setSize(800,600);
        Capa fig=new Capa(i);
        add(fig);
    }
    
    
   
}

 class Capa extends JPanel{
     int indice;
     
     public Capa(int i){
         indice=i;
     }
     
     @Override
     public void paintComponent(Graphics g){
         super.paintComponent(g);
         Graphics2D g2=(Graphics2D)g;
         
         int x=0;
         int y=30;
         int w=50;
         int h=100;
         
         for(int j=0;j<Usuario_Normal.Carga.length;j++){
             
                 if((Usuario_Normal.Carga[indice][j].equals(""))||(Usuario_Normal.Carga[indice][j]==null)){
                     
                 }else{
                     String a=Usuario_Normal.Carga[indice][j];
                     String[] coo=a.split(";");
                     Rectangle2D rectangulo=new Rectangle2D.Double(x, y, w,h);
                     Random r=new Random();
                     int n1=r.nextInt(249);
                     int n2=r.nextInt(249);
                     int n3=r.nextInt(247);
                    Color micolor=new Color(n1,n2,n3);
                     g2.setColor(micolor);
                    g2.drawString(coo[2], x, y+120);
                    g2.fill(rectangulo);
                    x+=20;
                 }
             }
         
         
         
         
        /* Rectangle2D rectangulo=new Rectangle2D.Double(0, 30, 50, 100);
         g2.setColor(Color.GREEN);
         g2.drawString("libro1", 0, 150);
         g2.fill(rectangulo);*/
         
         
         
         /*Color micolor=new Color(200,30,150);
          Rectangle2D rectangulo2=new Rectangle2D.Double(120, 30, 50, 100);
         g2.setColor(micolor);
         g2.fill(rectangulo2);
         g2.drawString("libro", 300, 250);*/
     }
    
}