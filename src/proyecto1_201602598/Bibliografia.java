
package proyecto1_201602598;

public class Bibliografia {

    private static String[] bibliografia;
    private static int longibibliografia=1;
    
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
    
    bibliografia=new String[600];
    
    /*autor="";
    titulo="";
    edicion=0;
    palcla=new String[500];
    descripcion="";
    temas=new String[500];
    copias="";
    disponibles=0;*/
    
}

public void aumentarLongi(){
    longibibliografia++;
}

public void setLongi(int i){
    longibibliografia=i;
}

public int obLongi(){
    return longibibliografia;
}

public void setBibliografia(String autor,String titulo,int edicion,String[] palcla,String descripcion,
        String[] temas,String copias,int disponibles){
    
    bibliografia[longibibliografia]=autor+";"+titulo+";"+edicion+";"+palcla+";"+descripcion+";"+temas
            +";"+copias+";"+disponibles;
    this.aumentarLongi();
    
}

public String[] obBibliografia(){
    return bibliografia;
}

public String obBibliografia(int i){
    
    String a=new String(bibliografia[i]);
    return a;
    
}

    
}
