package 黒本.chap3.Q10;

public class Main {
    public static void main(String[] args) {
        Object a = new Sample(10);
        Sample b = new Sample(10);

        System.out.println(a.equals(b));
    }
}
