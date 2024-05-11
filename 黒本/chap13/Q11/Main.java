package 黒本.chap13.Q11;

public class Main {
    private static int num;
    static {
        num = 10;
    }

    static {
        num = 20;
    }

    static void test(int val) {
        num = val * val;
        // Main.num = num; // 400に更新
    }

    public static void main(String[] args) {
        test(num);
        System.out.println(num);
    }
}
