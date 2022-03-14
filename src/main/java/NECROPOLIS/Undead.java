package NECROPOLIS;


public class Undead extends Necropolis {

    public Undead(int attackPoints, int definePoints, int damagePoints, int healthPoints,
                  int speed, int x, String speciality) {
        super(attackPoints, definePoints, damagePoints, healthPoints, speed, x, speciality);
    }

    @Override
    public int fight(NPC enemy) {
        int damage = this.getAttackPoints() - (this.getHealthPoints() + enemy.getDefencePoints());
        return damage;
    }

    @Override
    public int protect() {
        int damage = (this.getAttackPoints() + this.getDefencePoints()) + (this.getHealthPoints() + this.getAttackPoints());
        return damage;
    }

    @Override
    public int move(NPC enemy) {
        int xPos = this.getX();
        int distance = enemy.getX() - xPos;
        if (this.getX() < distance) {
            xPos++;
        } else {
            xPos--;
        }
        return xPos;

    }

    @Override
    public boolean enemyDefinition(NPC enemy) {
        if (enemy == null) {
            return false;
        }
        return true;
    }

    @Override
    public void die(Undead undead) {
        if (undead.getHealthPoints() <= 0) {
            undead = null;
        }
    }

    @Override
    public void necromancy() {

    }

    public int freeze(NPC enemy) {

        return 0;
    }

}
