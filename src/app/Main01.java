package app;

public class Main01 {

    public static void main(String[] args) {

        double income = 8000;
        double tax;

        if (income <= 10000) {
            tax = income * 2.5 / 100;
        } else if (income <= 25000) {
            tax = 10000 * 2.5 / 100 + (income - 10000) * 4.3 / 100;
        } else {
            tax = 10000 * 2.5 / 100 + 15000 * 4.3 / 100 + (income - 25000) * 6.7 / 100;
        }
        System.out.printf("Tax amount: %.2f%n", tax);
    }
}