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
         
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Biblioteca Virtual");
        setSize(1000,600);
        Capa fig=new Capa(i);
        fig.setBackground(Color.BLACK);
        add(fig);
    }
    
    
   
}

 class Capa extends JPanel{
     int indice;
     Color micolor;
     int n1,n2,n3;
            int x;
         int y;
         int w;
         int h;
         int contador;
         
     public Capa(int i){
        
         indice=i;
        x=0;
        y=30;
        w=50;
        h=100;
        contador=0;
     }

     @Override
     public void paintComponent(Graphics g){
     
         super.paintComponent(g);
         Graphics2D g2=(Graphics2D)g;
         try{   
         for(int j=0;j<Usuario_Normal.Carga.length;j++){
             
                 
                     String a=Usuario_Normal.Carga[indice][j];
                     String[] coo=a.split(";");
                     Rectangle2D rectangulo=new Rectangle2D.Double(x, y, w,h);
                     Random r=new Random();
                     n1=r.nextInt(249);
                     n2=r.nextInt(249);
                     n3=r.nextInt(247);
                    micolor=new Color(n1,n2,n3);
                     g2.setColor(micolor);
                    g2.drawString(coo[2], x, y+120);
                    g2.fill(rectangulo);
                    x+=320;
                    contador++;
                    if(contador==3){
                        int auxy=y;
                        y+=200;
                        int auxx=x;
                        x=0;
                        g2.setColor(Color.BLACK);
                        g2.drawLine(auxx, auxy, auxx, auxy);
                        contador=0;
                    }
                 
             }
         
         
     }
         catch(Exception e){
     
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
     //paint component
    
}