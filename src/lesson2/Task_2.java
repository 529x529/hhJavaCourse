package lesson2;

public class Task_2 {
    public static void main(String[] args) {
        counter(24213);
    }

    public static void counter(int n) {
        if (n < 10) {
            System.out.println(n);
        }
        else {
            counter(n/10);
            System.out.println(n%10);
        }
    }
}
