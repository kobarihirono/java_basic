package 黒本.chap4;

public class Main {
    public static void main(String[] args) {
        // int x = 1;
        
        // for(int y = 0, total = 0; y < 10; y++) {
        //     total = x * y;
        //     System.out.println(total);
        // }

        // int array[][] = new int[][] {{1,2},{2,3,4}};
        // int total = 0;

        // for(int i = 0; i < array.length; i++) {
        //     for(int j = i; j < array[i].length; j++) {
        //         total += array[i][j];
        //     }
        // }

        // System.out.println(total);

        // String[] array2 = {"A","B","C"};

        // for(String str : array2) {
        //     str = "X";
        // }

        // for(String str : array2) {
        //     System.out.println(str);
        // }

        // int[] array = {1,2,3,4,5};
        // int total = 0;
        
        // for (int i : array) {
        //     if (i % 2 == 0) {
        //         continue;
        //     }

        //     total += i;
        // }

        // System.out.println(total);

        // for (int i = 0; i <= 10; i++) {
        //     if (i == 5) {
        //         break; // 5の時にforループを抜ける
        //     }

        //     if (i % 2 == 0) {
        //         continue; // 偶数は表示しない
        //     }

        //     System.out.println(i);
        // }

        int total = 0;

        a: for (int i = 0; i < 5; i++) {
            b: for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) continue a;

                if (3 < j) break b;

                total += j; // 12
            }
        }

        System.out.println(total);
    }
}
