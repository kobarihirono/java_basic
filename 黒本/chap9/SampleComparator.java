package 黒本.chap9;
import java.util.Comparator;

public class SampleComparator implements Comparator<Sample>{
    @Override
    public int compare(Sample o1, Sample o2) { // 戻り値を使用してソートの順番を決定
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}