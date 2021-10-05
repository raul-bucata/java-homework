public class Alien implements Character {
    public int health = 200;
    public int energy = 100;

    public int getHealth() {
        return health;
    }

    public int setHealth() {
        if (health <= 0) {
            isDead();
        }
        return health;
    }

    public boolean isDead() {
        System.out.println("Alien has died");
        return true;
    }

    public int getEnergy() {
        return energy;
    }
}
