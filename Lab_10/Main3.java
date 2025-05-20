public class Main3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);

        double result = rect.area();
        System.out.println("Area of rectangle: " + result);

        rect.print();
    }
}