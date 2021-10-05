public class Human implements Character {
   public int health = 100;
    public  int ammo = 200;

    public int getHealth() {
        return health;
    }

    public int setHealth() {
        health = ;
        if (health <= 0) {
            isDead();
        }
        return health;
    }

    public boolean isDead() {
        System.out.println("Human has died");
        return true;
    }

    public int getAmmo() {
        return ammo;
    }

}



