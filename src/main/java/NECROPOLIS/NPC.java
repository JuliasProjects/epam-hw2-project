package NECROPOLIS;

public class NPC extends World {
    public NPC() {
    }

    public NPC(int attackPoints, int defencePoints, int damagePoints, int healthPoints,
               int speed, int x, String speciality) {
        super(attackPoints, defencePoints, damagePoints, healthPoints, speed, x, speciality);
    }

    boolean enemyDefinition(Undead undead) {
        if (undead != null) {
            System.out.println("NPC: Here is my enemy");
            return true;
        }
        return false;
    }

    public void move(Undead undead) {

        int distance = undead.getX() - this.getX();
        if (this.getAttackPoints() > distance) {
            int xPos = undead.getX();
            System.out.println("NPC: I'm moving towards you");
            if (xPos == undead.getX()) {
                System.out.println("NPC: I found you");
            }

        }
    }

    int fight(Undead undead) {
        int damage = this.getAttackPoints() - (this.getHealthPoints() + undead.getDefencePoints());
        System.out.println("NPC damage: " + damage + " points");
        return damage;

    }

    int protect() {
        int damage = (this.getAttackPoints() + this.getDefencePoints()) + (this.getHealthPoints() + this.getAttackPoints());
        System.out.println("NPC damage: " + damage + " points");
        return damage;
    }


    void die() {
        if (this.getHealthPoints() <= 0) {
            System.out.println("Your enemy is dead");

        }
    }
}
