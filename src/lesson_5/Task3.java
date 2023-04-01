package lesson_5;

import java.util.Scanner;

public class Task3 {

    @FunctionalInterface
    public interface MyFunctionalInterface {
        double result(double a, double b, double c);
    }
    public static void main(String[] args) {

        MyFunctionalInterface discriminant = (a, b, c) -> Math.pow(b,2) - (4 * a * c);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите число c: ");
        double c = scanner.nextDouble();

        System.out.println(discriminant.result(a,b,c));
    }
}
