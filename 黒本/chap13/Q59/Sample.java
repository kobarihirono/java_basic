package 黒本.chap13.Q59;

public class Sample {
    public static void main(String[] args) {
        int num = 10;
        Integer val = Integer.valueOf(10); // valueOfメソッドでInteger型に変換

        System.out.println(num == val); // アンボクシングされてint型になる
    }
}
