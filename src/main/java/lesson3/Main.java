package lesson3;

public class Main {
    public static void main(String[] args) {
        Mage Travis = new Mage("Travis", 50, 200, 80);
        HealthChecker<Mage> MageChecker = new HealthChecker<>();
        MageChecker.takeDamage(Travis, Travis.getHealth(), 10);
        MageChecker.isDeath(Travis, Travis.getHealth());
        Travis.display();
        Travis.castingFireBall();
        System.out.println(Travis.getMana());
        Travis.increasedMana();

        Warrior Sam = new Warrior("Sam", 100, 100, 150);
        HealthChecker<Warrior> WarriorChecker= new HealthChecker<>();
        WarriorChecker.takeDamage(Sam, Sam.getHealth(), 100);
        WarriorChecker.isDeath(Sam, Sam.getHealth());
        Sam.display();
        Sam.ultimateRage();
        Sam.increasedRage();
        Sam.setFatigue(51);
        Sam.getFatigue();
        System.out.println(Sam.getLevel());
    }
}