package test;

import main.MagicalArena;
import main.Player;

public class MagicalArenaTest {
    public static void main(String[] args) {

        System.out.println("\nTest Case 1: Verify Player isAlive function");
        Player player = new Player(100, 5,8);
        if (player.isAlive()){
            System.out.println("Player is Alive");
        } else {
            System.out.println("Player is Dead");
        }

        System.out.println("\nTest Case 2: Verify Player is Dead");
        player = new Player(100, 5,8);
        if (player.isAlive()){
            System.out.println("Player is Alive");
        } else {
            System.out.println("Player is Dead");
        }

        System.out.println("\nTest Case 3: Verify Player rollDie function");
        player = new Player(80, 7,12);
        int rollCount = 100;
        int[] rollCounts = new int[6];
        for(int i = 0; i < rollCount; i++){
            int roll = player.rollDie();
            rollCounts[roll -1]++;
        }
        boolean allRollsPresent = true;
        for (int count : rollCounts) {
            if (count == 0){
                allRollsPresent = false;
                break;
            }
        }
        if (allRollsPresent) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("\nTest Case 4: Verify Magical Arena Initialization");
        Player playerA =new Player(75, 8, 10);
        Player playerB =new Player(60, 12, 7);
        MagicalArena arena = new MagicalArena(playerA, playerB);
        if (arena.playerA == playerA && arena.playerB == playerB) {
            System.out.println("Test Passed : Initialized playerA and playerB");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("\nTest Case 5 : Verify Fight OutCome (Player A wins)");
        playerA = new Player(100, 15, 8);
        playerB = new Player(70, 10, 5);
        arena = new MagicalArena(playerA, playerB);
        arena.fight();

        System.out.println("---------------------------------------------------------------------");

        System.out.println("\nTest Case 6 : Verify Fight OutCome (Player B wins)");
        playerB = new Player(100, 15, 8);
        playerA = new Player(70, 10, 5);
        arena = new MagicalArena(playerA, playerB);
        arena.fight();

        System.out.println("---------------------------------------------------------------------");

    }
}