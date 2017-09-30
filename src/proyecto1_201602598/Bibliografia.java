
package proyecto1_201602598;

public class Bibliografia {

    public static String[] bibliografia;
    public static int longibibliografia=0;
    public static int longirevista=0;
    
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

public void setBibliografia(int tipo,String autor,String titulo,String descripcion,String palcla,int edicion,
        String temas,String frecuencia,String ejemplares,String area,int copias,int disponibles){
    
    //Tipo; Autor; Titulo; Descripción; Palabras Clave; Edición; 
    //Temas; Frecuencia Actual; Ejemplares; Área; Copias; Disponibles
    
    bibliografia[longibibliografia]=0+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+""+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
}//libro


public void setBibliografia(int po,int tipo,String autor,String titulo,String descripcion,String palcla,int edicion,
        String temas,String frecuencia,String ejemplares,String area,int copias,int disponibles){
    
    //Tipo; Autor; Titulo; Descripción; Palabras Clave; Edición; 
    //Temas; Frecuencia Actual; Ejemplares; Área; Copias; Disponibles
    
    bibliografia[po]=0+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+""+";"+copias+";"+disponibles;
    
}


public String[] obBibliografia(){
    return bibliografia;
}

public String obBibliografia(int i){
    
    String a=new String(bibliografia[i]);
    return a;
    
}

    
}
