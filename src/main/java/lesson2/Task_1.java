package lesson2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки х: ");
        int x = scanner.nextInt();
        System.out.println("Введите координаты точки y: ");
        int y = scanner.nextInt();
        System.out.println("Введите значение радиуса r: ");
        int r = scanner.nextInt();

        dotInTheCircle(x,y,r);

    }

    public static void dotInTheCircle(int x, int y, int r) {
        double hypotenuse = (Math.pow(x, 2) + Math.pow(y, 2));
        if (hypotenuse <= r) {
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка не принадлежит кругу");
        }
    }
}
