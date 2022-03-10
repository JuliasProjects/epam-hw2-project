package NECROPOLIS;

public interface Necropolis {


    int causeDamage(int damageDealt, int health, int defence);

    int protection(int defence, int health, int attackRange);

    void move(int attackRange);

    boolean enemyDefinition();

    void die(int health);


}
