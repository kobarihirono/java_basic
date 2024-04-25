package スッキリわかるJava入門.chap3;

public class issue1 {
    public static void main(String[] args) {
        // ①
        int weight = 60;
        if (weight == 60) {
            System.out.println("60kgです");
        }

        // ②
        int age1 = 10;
        int age2 = 20;

        if ((age1 + age2)*2 > 50) {
            System.out.println("計算結果は50を超えます");
        } else {
            System.out.println("計算結果は50以下です");
        }

        // ③
        int age = 30;
        if (age % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // ④
        String name = "湊";
        if (name.equals("湊")) {
            System.out.println("湊です");
        }
    }
}
