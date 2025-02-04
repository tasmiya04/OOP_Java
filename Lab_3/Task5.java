import  java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int Seat[][] = {{0,0,0,0,0,},{0,0,0,0,0,},{0,0,0,0,0}};
            System.out.println("1. Availible Seats");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Availible Seats"); 
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                       
                        System.out.print(Seat[i][j]);
                    }
                    System.out.println();}; 
                case 2: 
                System.out.println("Please Reserve a Seat");
                System.out.println("Enter the Row (1-3)");
                int row = input.nextInt();
                System.out.println("Enter the Seat (1-5)");
                int col = input.nextInt();
                Seat[row-1][col-1] = 1 + Seat[row-1][col-1];  
                System.out.println("You Book Seat Now " + col + " on " + row + " Row ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                       
                        System.out.print(Seat[i][j]);
                    }
                    System.out.println();}; 
                case 3:
                    break;
                default:
                    System.err.println("Range out of order");
            }
    }
}
