package スッキリわかるJava入門.chap5;

public class sample {
    public static void main(String[] args) {
        System.out.println("メゾットを呼び出します");
        hello();
        System.out.println("メゾットの呼び出しが終わりました");

        int ans = add(100, 20); // 戻り値を変数に代入
        System.out.println("100 + 20 = " + ans);

        int[] array = {1, 2, 3};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void hello() {
        System.out.println("こんにちは");
    }

    public static int add(int x, int y) {
        return x + y; // 戻り値
    }

    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
