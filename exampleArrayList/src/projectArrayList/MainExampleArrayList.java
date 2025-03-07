package projectArrayList;
import java.util.ArrayList;
public class MainExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
