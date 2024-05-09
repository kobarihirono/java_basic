package 黒本.chap13.Q42;

public class Sample implements AutoCloseable {
    @Override
    public void close() throws Exception { // AutoCloseableインターフェイスを実装
        System.out.println("C");
    }
}
