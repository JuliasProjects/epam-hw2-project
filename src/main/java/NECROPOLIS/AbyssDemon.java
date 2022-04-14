package necropolis;

public class AbyssDemon extends NPC implements Skills{
    Undead undead;

    public void mindControl(){
        suicide(undead);

    }

    private void suicide(Undead undead){
        System.out.println("i control all your thoughts");
        undead.setHealthPoints(-10);
    }


    @Override
    public void attack() {
        int damagePoints = this.getAttackPoints() - (this.getHealthPoints()+ undead.getDefencePoints());

    }

    @Override
    public void defence() {
        int damagePoints = this.getDefencePoints() + this.getHealthPoints() - undead.getAttackPoints();

    }

    @Override
    public void move() {
        int distance = undead.getX() - this.getX();
        if (this.getAttackPoints() < distance) {
            int xPos = undead.getX();
            System.out.println("Undead: I'm moving towards you");
            if (xPos == undead.getX()) {
                System.out.println("Undead: I'm in front of my enemy!");
            }
        }
    }

    @Override
    public void die() {

    }
}
