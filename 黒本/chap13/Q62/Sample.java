package 黒本.chap13.Q62;

public class Sample {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.sample();
        t2.sample();

        System.out.println(t1.value);
        System.out.println(t2.value);}
}
