import java.util.Scanner;
public class task_9 {
    public static void main(String[] args) {
        Scanner arth = new Scanner(System.in);
        System.out.println("Enter the Number");
        int First = arth.nextInt();
        System.out.println("Enter the Number");
        int Second = arth.nextInt();
        System.out.println("Enter the Operation (+ , - , * , / )");
        char Operation = arth.next().charAt(0);
        switch (Operation) {
            case '+':
                System.out.println("Addition: " + (First + Second));
                break;
            case '-':
                System.out.println("Subtraction: " + (First - Second));
                break;
            case '*':
                System.out.println("Multiplication: " + (First * Second));
                break;
            case '/':
                System.out.println("Division: " + (First / Second));
                break;
        
            default:
                System.out.println("You give a Wrong Operation");
                break;
        }
    }
}
