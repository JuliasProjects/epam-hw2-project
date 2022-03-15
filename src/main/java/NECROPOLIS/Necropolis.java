package NECROPOLIS;

public  class Necropolis extends World {

    public Necropolis() {
    }

    static boolean DEAD = true;
    static boolean MORALITY_INDICATOR = false;
    static boolean CURSE_IMMUNITY = true;
    static boolean BLESS_IMMUNITY = true;

    public Necropolis(int attackPoints, int definePoints, int damagePoints,
                      int healthPoints, int speed, int x, String spell) {
        super(attackPoints, definePoints, damagePoints, healthPoints, speed, x, spell);
    }


    public Undead necromancy() {
        return new Undead();

    }
}
