package スッキリわかるJava入門.chap3;

public class sample {
    public static void main(String[] args) {
        // while文
        boolean b = false;
        while ( b == true) {
            System.out.println("こんにちは"); // 無限ループ
        }

        // おみくじ
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4) + 1;
        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }


        // do-while文
        int temp = 32;

        do {
            temp--;
            System.out.println("温度を1度下げました");
        } while (temp > 25);
    }
}
