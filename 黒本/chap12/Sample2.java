package 黒本.chap12;

public class Sample2 {
    int a;
    int b;
    int c;
    int d;

    void setA(int a) {
        a = a; // 何もしない
    }

    void setB() {
        this.b = b; // 何もしない
    }

    int setC() {
        return c; // 設定されていない
    }

    int setD(int num) {
        d = num;
        return d; // numを返す
    }

    void setAll(int x) {
        a = b = this.c = setD(x); // xをすべてのフィールドに設定
    }

    @Override
    public String toString() {
        return "Sample2 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
    }

    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.setAll(10);
        System.out.println(s);
    }
}
