public class Battle {
    public Alien alien = new Alien();
    public Human human = new Human();

    public static void main(String[] args) {
        System.out.println("...Alien bites Human...");
        alienAttack();
        System.out.println("--------------------------------------------------------");

        System.out.println("...Human shoots Alien round 1");
        humanAttack();
        System.out.println("--------------------------------------------------------");

        System.out.println("...Human shoots Alien round 2");
        humanAttack();
        System.out.println("--------------------------------------------------------");
    }

    public static void humanAttack() {
        System.out.println("Alien health is: " + alien.getHealth());
        System.out.println("Human's remaining ammo: " + human.getAmmo());

        alien.setHealth();

        System.out.println("Alien health is: " + alien.getHealth());
        System.out.println("Human's remaining ammo: " + human.getAmmo());
    }

    public static void alienAttack() {
        System.out.println("Human health is: " + human.getHealth());
        System.out.println("Alien energy is: " + alien.getEnergy());

        human.setHealth();

        System.out.println("Human health is: " + human.getHealth());
        System.out.println("Alien energy is: " + alien.getEnergy());


    }
}



