package 黒本.chap6;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        // String val = s.getValue("hello");
        s.getValue();
        // System.out.println(val);

        int number = 10;
        System.out.println("Before method call: " + number);
        increase(number);
        System.out.println("After method call: " + number);
    }

    public static void increase(int num) {
        num = num + 5;
        System.out.println("Inside method: " + num);
    }
}
