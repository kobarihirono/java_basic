package スッキリわかるJava入門.chap9;

public class Hero {
    String name;
    int hp;
    Sword sword;

    public void Sleep() {
        this.hp = 100; // this.hpは、フィールドhpを指す
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void Sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }

    public void Slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    public void Run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("戦闘終了");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    // コンストラクタ
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
}
