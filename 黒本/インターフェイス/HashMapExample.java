package 黒本.インターフェイス;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMapの生成
        Map<String, Integer> map = new HashMap<>();

        // 要素の追加
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Cherry", 20);

        // キーによる値のアクセス
        Integer value = map.get("Apple");
        System.out.println("Value for 'Apple': " + value);

        // マップの全要素をキーと値のペアで表示
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
