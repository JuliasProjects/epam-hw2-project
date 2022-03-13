package NECROPOLIS;

public abstract class Necropolis {

    private int attackPoints; //дальность атаки
    private int defencePoints; //защита
    private int damagePoints; //урон
    private int healthPoints; //здоровье
    private int speed; //скорость
    private String speciality; // magic
    private int x; //координата Х
    private Enemy enemy;


    static boolean DEAD = true;
    static boolean MORALITY_INDICATOR = false;
    static boolean CURSE_IMMUNITY = false;
    static boolean BLESS_IMMUNITY = false;

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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Necropolis{" +
                "attackPoints=" + attackPoints +
                ", defencePoints=" + defencePoints +
                ", damagePoints=" + damagePoints +
                ", healthPoints=" + healthPoints +
                ", speed=" + speed +
                ", speciality='" + speciality + '\'' +
                ", X=" + x +
                '}';
    }


    public abstract int fight() {
        this.damagePoints = this.getAttackPoints() - (this.getHealthPoints() + enemy.getDefencePoints());


        return this.damagePoints;
    }


    public int protect() {
        this.damagePoints = (this.getDefencePoints() - enemy.getAttackPoints()) +
                (this.getHealthPoints() - enemy.getAttackPoints());

        return this.damagePoints;
    }


    public void move() {
        while (this.getAttackPoints() < enemy.getX()) {
            System.out.println("I'm moving" + x++);
            if (this.getX() == enemy.getX() && this.getX() == enemy.getX() - 1) {
                fight();
            }
        }


    }


    public boolean enemyDefinition() {

        if (!(this instanceof Necropolis)) {
            fight();
        }
        return true;
    }


    public void die() {
        if (this.getHealthPoints() <= 0) {
            System.out.println("What Is Dead May Never Die");
            healthPoints = (int) (this.damagePoints * 0.1);
        }

    }


    public void necromancy(Enemy enemy) {
        //how to turn an enemy into a creature

    }


}
