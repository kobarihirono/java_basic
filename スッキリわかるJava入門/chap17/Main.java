package スッキリわかるJava入門.chap17;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
        } catch (IOException e) { // FileWriterのコンストラクタで例外が発生した場合、IOExceptionをキャッチする必要がある
            System.out.println("エラーが発生しました");
        }
    }
}
