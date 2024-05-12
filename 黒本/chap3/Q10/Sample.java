package 黒本.chap3.Q10;

public class Sample {
    private int num;
    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(obj instanceof Sample) { // Sample型のオブジェクトであるかをチェック
            Sample s = (Sample)obj; // Sample型にキャスト
            return this.num == s.num;
        }

        return false;
    }
}
