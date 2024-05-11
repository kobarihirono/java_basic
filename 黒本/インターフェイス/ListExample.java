package 黒本.インターフェイス;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // ArrayListの生成
        List<String> list = new ArrayList<>();

        // 要素の追加
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 要素のアクセス
        System.out.println("First element: " + list.get(0));

        // リストの全要素を表示
        for (String item : list) {
            System.out.println(item);
        }
    }
}
