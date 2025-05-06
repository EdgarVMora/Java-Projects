package projectThrowable;

public class UncheckedThree {
    public static void main (String[] args){
        try{
            int boletosDisponibles= 0;
            if(boletosDisponibles == 0){ System.out.println("No hay boletos disponibles");}
        }
        catch(ArithmeticException e){
            e.getMessage();
        }
        finally{
            System.out.println("Taquilla cerrada :)");
        }
    }
    
}
