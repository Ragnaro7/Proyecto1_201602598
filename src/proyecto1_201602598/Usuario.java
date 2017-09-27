
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

public static void setUsuario(int i,String id,String nombre,String apellido,String user,String rol,String pass){
    
   
    Proyecto1_201602598.usuario[i]=id+","+nombre+","+apellido+","+user+","+rol+","+pass;
 
    
    
}

public static void setUsuario(String id,String nombre,String apellido,String user,String rol,String pass){
    
   
    Proyecto1_201602598.usuario[Proyecto1_201602598.longi]=id+","+nombre+","+apellido+","+user+","+rol+","+pass;
     Proyecto1_201602598.longi++;
    
    
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
