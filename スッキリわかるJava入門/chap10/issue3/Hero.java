package スッキリわかるJava入門.chap10.issue3;

public class Hero {
    private String name = "ミナト";
    private int hp = 100;

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
