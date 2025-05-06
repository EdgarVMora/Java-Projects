package projectThrowable;
import java.io.File;
import java.io.IOException;


public class Archivo {
    public static void main (String[] args){
    File archivo = new File("pruebaUno.txt");
    try {
        if(archivo.createNewFile()){
            System.out.println("El archivo fue creado correctamente");
        } else{
            System.out.println("El archivo ya existe");
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
