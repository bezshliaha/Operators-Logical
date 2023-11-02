package app;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Income: ");
        double income = sc.nextDouble();
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