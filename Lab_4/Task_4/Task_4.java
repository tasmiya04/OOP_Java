import java.util.Scanner;
public class Task_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for  ( int i = 0; i  <= 3 ; i++){
            System.out.println("Enter the " + (i+1) + " Employee Name");
            String names = input.nextLine();
            System.out.println("Enter the " + (i+1) + " Employee Joining year");
            int Joinyear = input.nextInt();
            System.out.println("Enter the " + (i+1) + " Employee Address");
            String location = input.nextLine();
            System.out.println("Enter the " + (i+1) + " Employee Salary");
            int income = input.nextInt();

            Employee name = new Employee(names, Joinyear, location, income);
            name.printInfo();
        }
        
    }
}
