package スッキリわかるJava入門.chap2;

import java.util.Scanner;

public class issue3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scannerオブジェクトを作成

        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = scanner.nextLine();

        System.out.print("あなたの年齢を入力してください>");
        String age = scanner.nextLine();

        System.out.println("占いの結果が出ました");
        System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + new java.util.Random().nextInt(4) + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

        scanner.close();
    }
}
