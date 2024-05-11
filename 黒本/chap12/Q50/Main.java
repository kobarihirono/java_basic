package 黒本.chap12.Q50;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        do {
            num++;
            if(num == 1) {
                continue;
            }

            System.out.println("This is skipped if num is 1");
            System.out.println(num);

        } while (num < 1);

        System.out.println("End");
    }
}
