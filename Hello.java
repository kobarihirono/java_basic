public class Hello {
    public static void main(String[] args) {
        System.out.println("こんにちは");
        System.out.println(30 + 3); // 足し算
        System.out.println(9 / 2); // 4
        System.out.println(9.0 / 2.0); // 4.5

        int a = 1;
        a++;
        System.out.println(a); // 2

        int x;
        x = 6;
        System.out.println(x * x * 3.14); // 変数

        System.out.println("二重引用符を表示するには、\"を使います。"); // エスケープシーケンス
        System.out.println("こんにちは、\nこばりです"); // 改行
    }
}