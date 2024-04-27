package スッキリわかるJava入門.chap10.issue3;

public class PoisonMatango extends Matango{
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);

        // 毒の胞子をばらまく
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.getHp() / 5;
            h.setHp(h.getHp() - damage);
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount--;
        }
    }
}
