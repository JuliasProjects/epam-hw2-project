package NECROPOLIS;

import java.util.Random;

public class Undead implements Necropolis {
    private int attackRange; //дальность атаки
    private int defence; //защита
    private int damageDealt; //урон
    private int health; //здоровье
    private int speed; //скорость
    private int level; //уровень
    private String specialAbility; //спец чит
    private int coordinateX; //координата Х

    static boolean DEAD = true;
    static boolean MORALITY_INDICATOR = false;
    static boolean CURSE_IMMUNITY = false;
    static boolean BLESS_IMMUNITY = false;

    public Undead() {

    }

    public Undead(int attackRange, int defence, int damageDealt, int health, int speed,
                  int level, String specialAbility, int coordinateX) {
        this.attackRange = attackRange;
        this.defence = defence;
        this.damageDealt = damageDealt;
        this.health = health;
        this.speed = speed;
        this.level = level;
        this.specialAbility = specialAbility;
        this.coordinateX = coordinateX;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    @Override
    public String toString() {
        return "Undead{" +
                "attackRange=" + attackRange +
                ", defence=" + defence +
                ", damageDealt=" + damageDealt +
                ", health=" + health +
                ", speed=" + speed +
                ", level=" + level +
                ", specialAbility='" + specialAbility + '\'' +
                ", coordinateX=" + coordinateX +
                '}';
    }

    @Override
    public int causeDamage(int damageDealt, int health, int defence) {
        int damage = damageDealt - (health + defence);
        return damage;
    }

    @Override
    public int protection(int defence, int health, int attackRange) {
        int damage = (defence + health) - attackRange;
        return damage;
    }

    @Override
    public void move(int attackRange) {
        Random random = new Random();
        int enemyPosition = random.nextInt(25);
        while (this.attackRange < enemyPosition) {
            coordinateX++;
        }

    }

    @Override
    public boolean enemyDefinition() {
        Object o = new Object();
        return o instanceof Undead;
    }

    @Override
    public void die(int health) {
        if (health <= 0 && this.level>=3){
            health++;
        } else {
            System.out.println("dead");
        }

    }

    void necromancy() {

    }

    void useSuperpower(String specialAbility) {

    }

    public void curseSpell(String s) {

    }

    void drinkLife() {

    }

    void attackWithoutResponse() {

    }

    public void addNewSkeletons() {

    }
}
