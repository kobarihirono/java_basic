package 黒本.chap13;

public class Main extends Sample {
    public static void main(String[] args) {
        A a = new B();
        // a.setValue(args); // Aクラスの中に受け取れるメソッドがないためコンパイルエラー

        Sample s = new Main();
        Sample s2 = new Sample();
        test(s);
        test(s2);
    }

    public void process() {
        System.out.println("B");
    }

    public static void test(Function f) {
        f.process();
    }
}
