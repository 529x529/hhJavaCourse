package lesson3;

public abstract class AbstractPersonage {

    public String nickName;
    public int level;
    public AbstractPersonage(String nickName, int level) {
        this.nickName = nickName;
        this.level = level;
    }

    public String getNickName() {
        return nickName;
    }

    public int getLevel() {
        return level;
    }

    public abstract void display();

}
