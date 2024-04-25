package スッキリわかるJava入門.chap5;

public class issue1 {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "太郎";
        int age = 20;
        double height = 170.0;
        char zodiac = '戌';
        System.out.println("名前：" + name + " 年齢：" + age + "歳" + " 身長：" + height + " 干支：" + zodiac);
    }
}
