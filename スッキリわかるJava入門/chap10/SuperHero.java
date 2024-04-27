package スッキリわかるJava入門.chap10;

public class SuperHero extends Hero{ // Heroクラスを継承
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    public void run() {
        System.out.println(this.name + "は撤退した");
    }

    public void attack(Matango m) { // Matangoクラスを引数に取るattackメソッド
        // Matango m1 = new Matango();
        
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
}
