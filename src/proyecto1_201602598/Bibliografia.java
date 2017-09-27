
package proyecto1_201602598;

public class Bibliografia {

    private static String[] bibliografia=new String[600];
    private static int longibibliografia=0;
    
/*private static String autor;
private static String titulo;
private static int edicion;
private static String[] palcla;
private static String descripcion;
private static String[] temas;
private static String copias;
private static int disponibles;*/

/*private static String frecuenciaactual;
private static int ejemplares;
private static String area;*/

public Bibliografia(){
    
    /*autor="";
    titulo="";
    edicion=0;
    palcla=new String[500];
    descripcion="";
    temas=new String[500];
    copias="";
    disponibles=0;*/
    
}

public void setBibliografia(String autor,String titulo,int edicion,String[] palcla,String descripcion,
        String[] temas,String copias,int disponibles){
    
    bibliografia[longibibliografia]=autor+";"+titulo+";"+edicion+";"+palcla+";"+descripcion+";"+temas
            +";"+copias+";"+disponibles;
}

    
}
