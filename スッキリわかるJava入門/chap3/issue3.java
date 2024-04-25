package スッキリわかるJava入門.chap3;

public class issue3 {
    public static void main(String[] args) {
        int isHungry = 1;
        String food = "ラーメン";

        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println(food + "をいただきます");
        }

        System.out.println("ごちそうさまでした");
    }
}
