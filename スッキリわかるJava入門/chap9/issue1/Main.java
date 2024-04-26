package スッキリわかるJava入門.chap9.issue1;

public class Main {
    public static void heal(int hp) { // 整数型の引数
        hp += 10;
    }

    public static void heal(Thief thief) { // Thief型の引数
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("アサカ",baseHp);

        heal(baseHp);
        // 値渡しにより、baseHpは変更されない
        System.out.println(baseHp + ":" + t.hp);

        heal(t);
        // 参照渡しにより、t.hpも変更される
        System.out.println(baseHp + ":" + t.hp);
    }
}
