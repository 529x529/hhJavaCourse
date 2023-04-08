package lesson4;

import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Введите пароль ещё раз: ");
        String confirmPassword = scanner.nextLine();
        System.out.println(checkLoginAndPassword(login, password, confirmPassword));
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        final String REGEX = "^[A-Za-z0-9_]{1,20}+$";

        try {
            if (!login.matches(REGEX)) {
                throw new WrongLoginException();
            }
            if (!password.matches(REGEX)) {
                throw new WrongPasswordException("Некорректный пароль или пароль содержит больше 20 символов");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException e) {
            System.out.println("Некорректный логин или логин содержит больше 20 символов");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}