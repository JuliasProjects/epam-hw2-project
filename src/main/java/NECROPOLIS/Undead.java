package NECROPOLIS;


public class Undead extends Necropolis {
    public Undead() {
    }

    public Undead(int attackPoints, int defencePoints, int damagePoints, int healthPoints,
                  int speed, int x, String speciality) {
        super(attackPoints, defencePoints, damagePoints, healthPoints, speed, x, speciality);
    }

    @Override
    public boolean enemyDefinition(NPC enemy) {

        if (enemy != null) {
            System.out.println("Undead: Here is my enemy");
            return true;
        }
        return false;
    }

    @Override
    public void move(NPC enemy) {
        int distance = enemy.getX() - this.getX();
        if (this.getAttackPoints() < distance) {
            int xPos = enemy.getX();
            System.out.println("Undead: I'm moving towards you");
            if (xPos == enemy.getX()) {
                System.out.println("Undead: I'm in front of my enemy!");
            }
        }

    }

    @Override
    public boolean fight(NPC enemy) {
        int damage = this.getAttackPoints() - (this.getHealthPoints() + enemy.getDefencePoints());
        System.out.println("Undead damage " + damage + " points");
        return true;
    }

    @Override
    public int protect() {
        int damage = (this.getAttackPoints() + this.getDefencePoints()) + (this.getHealthPoints() + this.getAttackPoints());
        System.out.println("Undead damage: " + damage + " points");
        return damage;
    }


    @Override
    public void die() {
        if (this.getHealthPoints() <= 0) {
            int health = this.getHealthPoints();
            health++;
            System.out.println("Undead: What Is Dead May Never Die!" + '\t' + health + " health points added");
        }
    }

    @Override
    public Undead necromancy() {
        System.out.println("new Undead is created");
        return new Undead();
    }

    public void throwMud() {

        System.out.println("Taste Necropolis  mud!");


    }

}
