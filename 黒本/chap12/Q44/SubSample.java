package 黒本.chap12.Q44;

public class SubSample extends Sample{
    int price;
    
    public SubSample(int price) { // 親クラスに引数を持たないコンストラクタがないため、コンパイルエラー
        this.price = price;
    }

    public SubSample(String name, int num, int price) {
        // super, thisはコンストラクタの最初に記述する必要がある
        super(name, num);
        // super,thisの両方を記述するとコンパイルエラー
        this(price);
    }
}
