package projectThrowable;

public class Unchecked {
    public static void main (String[] args){
        

      try{
        int division = 8/0;
        System.out.println(division);
      }
catch(ArithmeticException e){
    System.out.println("No se puede dividir entre cero");
}


    }

    
}
