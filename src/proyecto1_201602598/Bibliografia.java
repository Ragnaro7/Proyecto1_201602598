
package proyecto1_201602598;

public class Bibliografia {

    public static String[] bibliografia=new String[600];
    public static int longibibliografia=0;
   
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
    
    //bibliografia=new String[600];
    
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

public static void setBibliografia(int po){
    bibliografia[po]="";
}

public static void setBibliografiaM(String tipo,String autor,String titulo,String descripcion,String palcla,String edicion,
        String temas,String frecuencia,String ejemplares,String area,String copias,String disponibles){
    
    //Tipo; Autor; Titulo; Descripción; Palabras Clave; Edición; 
    //Temas; Frecuencia Actual; Ejemplares; Área; Copias; Disponibles
    
    bibliografia[longibibliografia]=tipo+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+""+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
}//libro


public static void setBibliografia(String tipo,String autor,String titulo,String descripcion,String palcla,String edicion,
        String temas,String frecuencia,String ejemplares,String area,String copias,String disponibles){
    
    //Tipo; Autor; Titulo; Descripción; Palabras Clave; Edición; 
    //Temas; Frecuencia Actual; Ejemplares; Área; Copias; Disponibles
    
    bibliografia[longibibliografia]=0+";"+autor+";"+titulo+";"+descripcion+";"+palcla+";"+edicion+";"+temas
            +";"+""+";"+""+";"+""+";"+copias+";"+disponibles;
    //this.aumentarLongi();
    longibibliografia++;
}//libro


public static void setBibliografia(int po,int tipo,String autor,String titulo,String descripcion,String palcla,String edicion,
        String temas,String frecuencia,String ejemplares,String area,String copias,String disponibles){
    
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
