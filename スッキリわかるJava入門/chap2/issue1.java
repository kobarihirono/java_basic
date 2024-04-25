package スッキリわかるJava入門.chap2;

public class issue1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String ans = "x+yは" + (x + y); 
        // 数値と文字列で+演算子を使うと、数値が文字列に変換されるため()で囲む
        System.out.println(ans);
    }
}
