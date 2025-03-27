package projectItems;

public class Main {
    public static void main(String[] args) {
        WeighedItem banana = new WeighedItem("Banana", 3.00, 1.37);
        CountedItem pens = new CountedItem("Pens", 4.5, 10);

        System.out.println(banana);
        System.out.println(pens);
    }
}
