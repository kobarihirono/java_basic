package 黒本.chap13.Q69;

public class Main {
    public static void main(String[] args) {
        String[] array = {"A", "B"};
        int i = 0;

        while (i < array.length) {
            int j = 0;
            do {
                ++j; // jが1増える
            } while ( j < array[i].length() );

            System.out.println(array[i] + ":" + j); // A:1, B:1
            i++;
        }
    }
}
