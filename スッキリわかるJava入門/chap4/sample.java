package スッキリわかるJava入門.chap4;

public class sample {
    public static void main(String[] args) {
        int[] scores = { 20, 30, 40, 50, 80 };
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.println(scores[i]);
        }

        System.out.println("合計点：" + sum);
        int num = scores.length;
        System.out.println(num);

        int[] seq = new int[10];
        char[] base = { 'A', 'T', 'G', 'C' };

        for (int i = 0; i < seq.length; i++) {
            // ランダムなインデックスを生成
            seq[i] = (int) (Math.random() * base.length);
            // 保存されたインデックスを変換
            System.out.print(base[seq[i]] + " ");
        }
        System.out.println();
    }
}
