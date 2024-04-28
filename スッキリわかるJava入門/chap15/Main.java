package スッキリわかるJava入門.chap15;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // String s1 = "スッキリJava";
        // String s2 = "Java";
        // String s3 = "java";

        // if(s2.equals(s3)){
        //     System.out.println("s2とs3は等しい");
        // }

        // if(s2.equalsIgnoreCase(s3)){
        //     System.out.println("s2とs3はケースを区別しなければ等しい");
        // }

        // System.out.println("s1の長さは" + s1.length() + "です");

        // if (s1.contains("Java")) {
        //     System.out.println("文字列s1はJavaを含んでいます");
        // }

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 100; i++) {
        //     sb.append("Java");
        // }

        // String s = sb.toString();
        // System.out.println(s);

        // final String FORMAT = "%-9s %-13s 所持金%,6d";
        // String s4 = String.format(FORMAT, "hero", "鈴木", 100);
        // System.out.println(s4);

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);
    }
}
