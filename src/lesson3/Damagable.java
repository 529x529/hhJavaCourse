package lesson3;

public interface Damagable <T> {

    void isDeath(T target, int currentHealth);

    void takeDamage(T target, int currentHealth, int damage);
}
