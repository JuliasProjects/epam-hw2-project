package NECROPOLIS;

import java.util.Random;

public class Game {
    public static void main(String[] args) {

        Undead boneDragon = new Undead();
        boneDragon.setAttackPoints(17);
        boneDragon.setDefencePoints(15);
        boneDragon.setDamagePoints((int) (Math.random() * 25 + 25));
        boneDragon.setHealthPoints(150);
        boneDragon.setSpeed(9);
        boneDragon.setX(0);
        boneDragon.setSpeciality("Turns an enemy into an undead throwing mud");


        NPC demon = new NPC();
        demon.setAttackPoints(2);
        demon.setDefencePoints(3);
        demon.setDamagePoints((int) (Math.random() * 2 + 1));
        demon.setHealthPoints(3);
        demon.setSpeed(9);
        demon.setX(25);
        demon.setSpeciality("pyromaniac");


        attack(boneDragon, demon);
    }

    public static void attack(Undead undead, NPC npc) {
        search(undead, npc);

        while (undead.getDamagePoints() < undead.getHealthPoints() | npc.getDamagePoints() < npc.getHealthPoints()) {
            randomFight(undead, npc);
            int undeadHealth = undead.getHealthPoints();
            undeadHealth--;

            int npcHealth = npc.getHealthPoints();
            npcHealth--;

            if(npcHealth<=0 | undeadHealth<=0){
                npc.die();
                undead.die();
            }
        }


    }

    public static void search(Undead undead, NPC npc) {
        undead.enemyDefinition(npc);
        npc.enemyDefinition(undead);
        undead.move(npc);
        npc.move(undead);
    }

    public static void randomFight(Undead undead, NPC npc) {
        //Random random = new Random();
        undead.fight(npc);
        npc.protect();
        undead.throwMud();

        npc.fight(undead);
        undead.protect();


    }
}
