package スッキリわかるJava入門.chap4;

public class issue2 {
    public static void main(String[] args) {
        int monthDays[] = { 121902, 8302, 55100 };
        for (int i = 0; i < monthDays.length; i++) {
            System.out.println(monthDays[i]);
        }

        for (int value : monthDays) { // 拡張for文
            System.out.println(value);
        }
    }
}
