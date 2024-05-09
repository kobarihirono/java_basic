package 黒本.chap12;

public class Object {
    public void test(Object[] objs) {
        System.out.println("A");
    }

    public void test(String[] array) { // ポリモーフィズムにより、String[]はObject[]のサブクラスとして扱われる
        System.out.println("B");
    }

    public void test(Object obj) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Object().test(args);
    }
}
