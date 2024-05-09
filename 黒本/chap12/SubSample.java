package 黒本.chap12;

public class SubSample extends Sample {
    int price;

    public SubSample(int price) { // デフォルトコンストラクタがないため、明示的に定義する必要がある
        // super('第一引数'); // 引数がひとつのコンストラクタは親クラスに存在しないため、コンパイルエラー
        this.price = price;
    }

    public SubSample(String name, int num, int price) {
        super(name, num);
        this(price); // コンストラクタの呼び出しは、最初の行で行う必要がある
    }
}
