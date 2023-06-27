package lesson3;

public abstract class AbstractPersonage {
    public String nickName;
    public int level;
    public int health;

    public AbstractPersonage(String nickName, int level, int health) {
        this.nickName = nickName;
        this.level = level;
        this.health = health;
    }

    public String getNickName() {
        return nickName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public abstract void display();

}
