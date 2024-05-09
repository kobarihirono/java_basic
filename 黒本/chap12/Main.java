package 黒本.chap12;

public class Main {
    public static void main(String[] args) {
        // int num = 0;

        // do {
        //     num++; // 1

        //     if(num == 1) { // true
        //         continue;
        //     }

        //     System.out.println(num); // continueでスキップされる
        // } while(num < 1); // false

        // byte x = 5, y = 2;
        // float a = Math.round((float) x / y * 100) / (float) 100; // xをfloatにキャストしてからyで割る
        // float b = (float) (Math.round((float) x / y * 100) / 100);
        // System.out.println(a);
        // System.out.println(b);

        short s1 = 10;
        Integer s2 = 20;
        Long s3 = (long) s1 + s2; // s1をlongにキャストしてからs2と足す
        
        // String s4 = (String) (s3 + s2); // 直接Stringにキャストできない
        String s4 = String.valueOf(s1 + s2);
        System.out.println(s3 + s4);
    }
}
