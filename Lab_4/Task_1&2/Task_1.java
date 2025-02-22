public class Task_1 {
   public static void main(String[] args) {
        Circle red_circle = new Circle(5, "red");
        Circle green_circle = new Circle(7, "green");

        System.out.println("Radius of Red Circle: " + red_circle.radius);
        System.out.println("Radius of Green Circle: " + green_circle.radius);

        red_circle.calculateArea();
        green_circle.calculateArea();
    }
}