package projectThrowable;

public class UncheckedDos {
    public static void main (String [] args){
        int [] numeros = { 1, 2, 3, 4, 5};
        try {
            System.out.println(numeros[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El indice esta fuera de los limites, perro");
        }
        finally{
            System.out.println("Cerrando el programa");
        }
    }
    
}
