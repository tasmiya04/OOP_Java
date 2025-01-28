import java.util.Scanner;

class task_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int array[] = new int[10];
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Index  number " + i + ": ");
			array[i] = input.nextInt();
			if (array[i]%4 == 0)
			{
				sum = sum + array[i];
			}
		}
		System.out.println("Sum of 4: "+ sum);
} 	// End of main
}	// End of Class