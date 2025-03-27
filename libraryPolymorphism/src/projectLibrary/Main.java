package projectLibrary;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Printed(7985, "Alicia en el País de las Maravillas", 105),
            new Multimedia(3565, "En un Estado de Ánimo Sentimental", 597),
            new Printed(1243, "El Arte de la Programación de Computadoras", 752),
            new Multimedia(7896, "Banda Sonora de Interestelar", 4230)
        };

        imprimirItems(items);
    }

    public static void imprimirItems(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
