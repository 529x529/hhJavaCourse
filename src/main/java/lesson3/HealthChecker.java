package lesson3;

public class HealthChecker <T extends AbstractPersonage> implements Damagable <T> {

    @Override
    public void takeDamage(T target, int currentHealth, int damage) {
        currentHealth -= damage;
        System.out.println("Personage: " + target.getNickName() + " take " + damage + " damage. " + currentHealth + " HP left");
    }

    public void isDeath(T target, int currentHealth) {
        if (currentHealth <= 0) {
            System.out.println("Personage: " + target.getNickName() + " is Death");
        } else {
            System.out.println("Personage: " + target.getNickName() + " is Alive");
        }
    }
}
