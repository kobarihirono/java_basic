package 黒本.chap13.Q65;

public class Sample {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        if(a++ > ++b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        System.out.println(a + ":" + b);
    }
}
