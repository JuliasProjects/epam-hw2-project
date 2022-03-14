package NECROPOLIS;

public class Game {
    public static void main(String[] args) throws DeadException {
        Undead boneDragon = new Undead(17, 15, (int) (Math.random() * 25 + 25), 150,
                9, 0, "freezer");

        NPC demon = new NPC(2, 3, (int) (Math.random() * 2), 3,
                9, 25, "pyromaniac");
        attack(boneDragon, demon);
    }

    public static void attack(Undead undead, NPC npc) throws DeadException {
        undead.enemyDefinition(npc);
        undead.move(npc);
        undead.fight(npc);
        undead.protect();
        undead.die(undead);
        undead.freeze(npc);

        npc.enemyDefinition(undead);
        npc.move(npc);
        npc.fight(undead);
        npc.protect();
        npc.die(npc);


    }
}
