package 黒本.chap10;

public class Main {
    public static void main(String[] args) {
        // 空の配列
        int[] array = {};

        System.out.println(test(null));
    }

    private static String test(Object obj) {
        try {
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            return "A";
        } finally {
            System.out.println("B");
        }

        return "C";
    }
}
