package lesson5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();

        MyInterface ref = (number) -> number % 13 == 0;
        System.out.println("Результат " + ref.getResult(input));
    }
}
