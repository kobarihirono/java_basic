package 黒本.chap13.Q71;

public class Main {
    public static void main(String[] args) {
        try {
            if(args.length == 0) {
                sample(null);
            } else {
                sample(args[0]);
            }
        } catch(Exception e) {
            System.out.println("error");
        } 
    }

    private static void sample(String str) throws Exception { // シグネチャを宣言
            if (str == null) throw new Exception();
            throw new RuntimeException();
    }
}
