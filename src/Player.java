import java.util.Random;

public class Player {
    int health;
    int strength;
    int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
    public boolean isAlive() {
        return health > 0;
    }

    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}