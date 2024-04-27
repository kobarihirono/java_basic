package スッキリわかるJava入門.chap12;

public class Main {
    public static void main(String[] args) {
        Character c = new Wizard();
        Wizard w = (Wizard)c;
        Matango m = new Matango();
        c.name = "アサカ";

        w.attack(m);
        w.fireball(m);
    }
}
