package Tutorials;

public class ArrayDemo {
    public static void main(String[] args) {
//
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        System.arraycopy(copyFrom, 0, copyTo, 3, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

    }
}
