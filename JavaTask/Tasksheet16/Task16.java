interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        System.out.println("Feeding the gorilla.");
        return timeToEat;
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
