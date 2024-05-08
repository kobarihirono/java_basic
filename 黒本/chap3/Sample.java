package 黒本.chap3;

public class Sample {
    private int num;

    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Sample obj) { // Objectを引数に渡していないとオーバーライドしない
        if(obj == null) {
            return false;
        }

        return this.num == obj.num;
    }
}
