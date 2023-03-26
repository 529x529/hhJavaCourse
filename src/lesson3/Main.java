package lesson3;

public class Main {
    public static void main(String[] args) {
        Warrior Sam = new Warrior("Sam", 100, 100);
        Sam.display();
        Mage Travis = new Mage("Travis", 50, 100);
        Travis.display();
        Travis.castingFireBall();
        Sam.ultimateRage();
        System.out.println(Travis.getMana());
        Travis.increasedMana();
        Sam.increasedRage();
        Sam.setFatigue(51);
        Sam.getFatigue();
        System.out.println(Sam.getLevel());
    }
}