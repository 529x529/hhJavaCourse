package lesson4;

public class Checker {
    public static void main(String[] args) {
        System.out.println(checkLoginAndPassword("m21212121_", "123456_", "123456_"));
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^[A-Za-z0-9_]+$")) {
                throw new WrongLoginException();
            }
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (!password.matches("^[A-Za-z0-9_ ]+$")) {
                throw new WrongPasswordException("Некорректный пароль");
            }
            if (password.length() > 20) {
                throw new WrongPasswordException("Пароль содержит больше 20 символов");
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