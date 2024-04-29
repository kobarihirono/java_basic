package 黒本;

public class chap4 {
    public static void main(String[] args) {
        // No.9
        int array[][] = new int[][] {{1,2}, {2,3,4}};
        int total = 0;

        for(int i=0; i<array.length; i++) {
            for(int j=i; j<array[i].length; j++) {
                total += array[i][j]; // 要素を足していく
            }
        }

        System.out.println(total);
    }
}
