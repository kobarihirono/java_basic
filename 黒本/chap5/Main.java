package 黒本.chap5;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array[0]);

        // int[2] b; // コンパイルエラー

        Item[] items = new Item[3];
        int total = 0;

        for (int i = 0; i < items.length; i++) {
            items[i] = new Item();
            total += items[i].price;
        }

        System.out.println(total);
    }
}
