package 黒本.chap9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sample[] samples = { // オブジェクトの初期化
            new Sample(1, "A"),
            new Sample(3, "C"),
            new Sample(2, "B")
        };

        List<Sample> list = new ArrayList<>(Arrays.asList(samples)); // 配列をリストに変換

        // リストの並び替え
        list.sort(new SampleComparator());
        for (Sample s : list) {
            System.out.println(s.getName());
        }
    }
}
