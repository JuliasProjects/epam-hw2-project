package NECROPOLIS;

public abstract class World {

    private int attackPoints, defencePoints, damagePoints, healthPoints, speed, x;
    private String speciality;

    public World(int attackPoints, int defencePoints, int damagePoints,
                 int healthPoints, int speed, int x, String speciality) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.damagePoints = damagePoints;
        this.healthPoints = healthPoints;
        this.speed = speed;
        this.x = x;
        this.speciality = speciality;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    int move(NPC enemy){
        return 0;
    }

    int fight(NPC enemy) {
        return 0;
    }

    int protect() {
        return 0;
    }



    boolean enemyDefinition(NPC enemy) {
        return true;
    }

    void die(Undead undead) throws DeadException {

    }
}
