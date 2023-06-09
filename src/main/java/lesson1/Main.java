package lesson1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Task 1 ----------");
        changeInputNumber();
        System.out.println("--------- Task 2 ----------");
        numberChecker();
        System.out.println("--------- Task 3 ----------");
        countChecker();
        System.out.println("--------- Task 4 ----------");

        int size = 5;

        int upperBound = 5;
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];

        Random random = new Random();

        IntStream.range(0, size).forEach(index -> firstArray[index] = random.nextInt(upperBound));
        IntStream.range(0, size).forEach(index -> secondArray[index] = random.nextInt(upperBound));

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        createArrays(firstArray, secondArray);
    }

    // --------- Task 1 ----------
    public static void changeInputNumber() {
        System.out.println("Введи целое трехзначное положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 100;
        int middle = (number / 10) % 10;
        int last = number % 10;

        if (number > 500 && number < 1000) {
            int newNumber = last * 100 + middle * 10 + first;
            System.out.println(newNumber);
        } else {
            int newNumber = first * 100 + last * 10 + middle;
            System.out.println(newNumber);
        }
    }

    // --------- Task 2 ----------
    public static void numberChecker() {
        for (int number = 100; number <= 999; number++) {
            if (number % 10 == 0) {
                int dividerSum = 0;
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0 && (i % 2) != 0) {
                        dividerSum = dividerSum + i;
                    }
                }
                if (dividerSum % 10 == 0)
                    System.out.println(number);
            }
        }
    }

    // --------- Task 3 ----------
    public static void countChecker() {
        int maxVeight = 450;
        int maxPersonLimit = 6;
        int veightCount = 0;
        int personCount = 0;

        while (maxPersonLimit > personCount && maxVeight > veightCount) {
            System.out.println("Вес человека: ");
            Scanner scanner = new Scanner(System.in);
            int personVeight = scanner.nextInt();
            personCount = personCount + 1;
            veightCount += personVeight;
            if (veightCount > maxVeight) {
                System.out.println("Превышен лимит, лимит не более 450 кг");
                break;
            } else if (personCount == maxPersonLimit) {
                System.out.println("Превышен лимит, лимит не более 6 человек");
                break;
            }
        }
        System.out.println("Количество людей, вошедших в лифт: " + personCount);
        System.out.println("Общий их вес: " + veightCount);
    }

    // --------- Task 4 ----------
    public static void createArrays (int[] firstArray, int [] secondArray) {
        int [] result;
        for (int i : firstArray) {
            boolean contains = false;
            for (int j : secondArray) {
                if (i == j) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                result = new int[]{i};
                System.out.println(Arrays.toString(result));
            }
        }
    }
}
