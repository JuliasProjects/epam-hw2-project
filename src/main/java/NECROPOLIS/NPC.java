package NECROPOLIS;

public class NPC extends World {
    public NPC(int attackPoints, int defencePoints, int damagePoints, int healthPoints,
               int speed, int x, String speciality) {
        super(attackPoints, defencePoints, damagePoints, healthPoints, speed, x, speciality);
    }


    int fight(Undead undead) {
        int damage = this.getAttackPoints() - (this.getHealthPoints() + undead.getDefencePoints());
        return damage;

    }

    int protect(Undead undead) {
        int damage = (this.getAttackPoints() + this.getDefencePoints()) + (this.getHealthPoints() + this.getAttackPoints());
        return damage;
    }


    boolean enemyDefinition(Undead undead) {
        if (undead == null) {
            return false;
        }
        return true;
    }

    void die(NPC npc) {
        if (npc.getHealthPoints() <= 0) {
            npc = null;
        }
    }
}
