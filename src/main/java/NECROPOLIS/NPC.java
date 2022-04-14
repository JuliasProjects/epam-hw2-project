package necropolis;

public abstract class NPC {
    private String name;
    private int attackPoints;
    private int defencePoints;
    private int damage;
    private int healthPoints;
    private NPC enemy;
    private int x;

    public NPC() {
    }

    public NPC(int attackPoints, int defencePoints, int damage, int healthPoints, NPC enemy, int x) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.enemy = enemy;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public NPC getEnemy() {
        return enemy;
    }

    public void setEnemy(NPC enemy) {
        this.enemy = enemy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}
