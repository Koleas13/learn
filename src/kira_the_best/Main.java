package kira_the_best;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        System.out.println("Введите температуру!");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
