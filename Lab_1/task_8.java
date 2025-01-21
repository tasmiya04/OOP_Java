import java.util.Scanner;
public class task_8 {
    public static void main(String[] args) {
        Scanner speed = new Scanner(System.in);
        System.out.println("mph into kmph");
        float mph = speed.nextFloat();
        System.out.println((mph * 1.6) + " Kmph");
    }
}
