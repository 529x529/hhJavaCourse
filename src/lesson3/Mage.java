package lesson3;

class Mage extends AbstractPersonage implements SpellCasting {

    public int mana;

    public static String race = "Elf";

    public Mage(String nickName, int level, int mana) {
        super(nickName, level);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }


    @Override
    public void display() {
        System.out.println("Personage name: " + getNickName() + ", race: " + race + ", his class: Mage");
    }

    @Override
    public void increasedMana() {
        mana = mana + 10;
        castingRaceElfSpell();
    }

    @Override
    public void decreasedMana() {
        mana = mana - 10;
    }

    @Override
    public void castingFireBall() {
        System.out.println("Casting spell - fire ball");
        decreasedMana();
        System.out.println("Remaining mana: " + mana);
    }

    public static void castingRaceElfSpell() {
        System.out.println("Casting spell - shield");
    }
}
