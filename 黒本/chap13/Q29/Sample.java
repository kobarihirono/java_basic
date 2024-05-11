package 黒本.chap13.Q29;

public class Sample {
    private final int num;

    public Sample(int num) {
        this.num = num;
    }

    public Sample(String str) {
        this.num = Integer.parseInt(str);
    }

    // public Sample() {} // numが初期化されていないためコンパイルエラー
}
