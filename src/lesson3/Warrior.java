package lesson3;

class Warrior extends AbstractPersonage implements RageLimit{

    public int rage;

    public static String race = "Human";

    private int fatigue = 0;

    public Warrior(String nickName, int level, int rage) {
        super(nickName, level);
        this.rage = rage;

    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    @Override
    public void display() {
        System.out.println("Personage name: " + getNickName() + ", race: " + race + ", his class: Warrior");

    }

    @Override
    public void increasedRage() {
        rage = rage + 10;
    }

    @Override
    public void decreasedRage() {
        rage = rage - 10;
    }

    @Override
    public void getFatigue() {
        if (fatigue > 50) {
            System.out.println("The character is tired");
            decreasedRage();
        }
    }

    public void ultimateRage() {
        int ultimateRageTime = 3;
        while(ultimateRageTime > 0) {
            System.out.println("Ultimate RAGE!!");
            decreasedRage();
            ultimateRageTime--;
        }
    }
}
