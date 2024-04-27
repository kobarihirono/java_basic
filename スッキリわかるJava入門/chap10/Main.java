package スッキリわかるJava入門.chap10;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();

        SuperHero sh = new SuperHero();
        sh.fly();
        sh.attack(new Matango());
        sh.run(); // SuperHeroクラスのrunメソッドが呼び出される
    }
}
