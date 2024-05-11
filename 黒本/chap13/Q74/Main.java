package 黒本.chap13.Q74;

public class Main {
    public static void main(String[] args) {
        // char[][] array1 = {{'a', 'b'}, {'c', 'd'}};
        // char[][] array2 = array1.clone(); // 参照先は同じ
        // char[] array3 = array1[1].clone(); // 参照先は異なる

        // System.out.println(array1[1] == array2[1]); // true
        // System.out.println(array1[1] == array3); // false
        // System.out.println(array1[1] == array3); // false
        // System.out.println(array1.equals(array2)); // false

        int[] array1 = {1,2,3};
        int[] array2 = array1.clone(); // 参照先は異なる

        System.out.println(array1[1] == array2[1]); // プリミティブ型なので値の比較、true
        System.out.println(array1.equals(array2)); // メモリアドレスの比較、false

    }
}
