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
    public void die(Undead undead) throws DeadException {
        if (undead.getHealthPoints() <= 0) {
            throw new DeadException("What Is Dead May Never Die!");
        }
    }

    @Override
    public void necromancy(Undead undead) {

        if (undead.getHealthPoints()<=0){

        }

    }

    public int freeze(NPC enemy) {
        int count = enemy.getHealthPoints();
        while (count!=0) {
            String spell = "meus gelidus inimicus mihi vita";
            System.out.println(spell);
            count--;


        }

        return count;
    }

}
