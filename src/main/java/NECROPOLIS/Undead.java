package necropolis;

public class Undead extends NPC implements Skills{

    AbyssDemon abyssDemon;

    public Undead(){

    }

    public Undead(int attackPoints, int defencePoints, int damage, int healthPoints, NPC enemy, int x) {
        super(attackPoints, defencePoints, damage, healthPoints, enemy, x);
    }

    public Undead(AbyssDemon abyssDemon) {
        this.abyssDemon = abyssDemon;
    }

    public Undead necromancy(){
        if(abyssDemon.getHealthPoints()<=0){
            System.out.println("new Undead is created");
          return new Undead(abyssDemon);
        }


    }

    @Override
    public void attack() {
        int damagePoints = this.getAttackPoints() - (this.getHealthPoints()+ abyssDemon.getDefencePoints());
    }

    @Override
    public void defence() {
        int damagePoints = this.getDefencePoints() + this.getHealthPoints() - abyssDemon.getAttackPoints();
    }

    @Override
    public void move() {


    }

    @Override
    public void die() {
        if(this.getHealthPoints()<=0){

        }

    }
}
