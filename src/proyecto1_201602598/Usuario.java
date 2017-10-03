
package proyecto1_201602598;

/**
 *
 * @author Hector
 */
public class Usuario {

//private String []id,nombre,apellido,user,rol,pass;
    
private boolean log;

public Usuario(){
   
}

public static void setUsuario(int i,String id,String nombre,String apellido,String user,String rol,String pass,int num){
    
    String ap=new String(Proyecto1_201602598.usuario[i]);
    String[]x=ap.split(",");
    String r=x[6];
    Proyecto1_201602598.usuario[i]=id+","+nombre+","+apellido+","+user+","+rol+","+pass+","+r;
 
    
    
}

public static void setUsuario(String id,String nombre,String apellido,String user,String rol,String pass,int num){
    
   
    Proyecto1_201602598.usuario[Proyecto1_201602598.longi]=id+","+nombre+","+apellido+","+user+","+rol+","+pass+","+num;
     Proyecto1_201602598.longi++;
    Proyecto1_201602598.contador++;
    
}

public static void setUsuario(int i){
    //Proyecto1_201602598.usuario[i]=""+","+""+","+""+","+""+","+""+","+"";
      Proyecto1_201602598.usuario[i]="";
}


public static String obUsuario(int i){
   
    String a=new String(Proyecto1_201602598.usuario[i]);
    return a+","+String.valueOf(Proyecto1_201602598.longi);
   
    
    //String a=new String(usuario[longi-2]);
    //return a+" "+String.valueOf(longi);
    
}

public static int l(){
    return  Proyecto1_201602598.usuario.length;
}


    
}
