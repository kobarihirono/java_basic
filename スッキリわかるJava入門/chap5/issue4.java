package スッキリわかるJava入門.chap5;

public class issue4 {
    public static void main(String[] args) {
        calcTriangleArea(10.0, 5.0);
        calcCircleArea(5.0);
    }

    public static void calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        System.out.println("三角形の面積は" + area + "です");
    }

    public static void calcCircleArea(double radius) {
        double area = radius * radius * 3.14;
        System.out.println("円の面積は" + area + "です");
    }
}
