package app;

public class Main01 {

    public static void main(String[] args) {

        double income = 10000;
        double tax;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }
        System.out.printf("Tax amount: %.2f%n", tax);
    }
}