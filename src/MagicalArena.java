public class MagicalArena {
    public Player playerA;
    public Player playerB;
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }
    public void fight() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()){
            int attackRoll = attacker.rollDie();
            int defendRoll = defender.rollDie();
        }
    }
}
