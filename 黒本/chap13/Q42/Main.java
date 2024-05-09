package 黒本.chap13.Q42;

public class Main {
    public static void main(String[] args) {
        try (Sample s = new Sample()) {
            System.out.println("A");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
