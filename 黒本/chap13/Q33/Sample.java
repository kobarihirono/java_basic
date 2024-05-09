package 黒本.chap13.Q33;

public class Sample {
    public void test(Object[] val) {
        System.out.println("A");
    }

    public void test(String[] val) {
        System.out.println("B");
    }

    public void test(Object val) {
        System.out.println("C");
    }
}
