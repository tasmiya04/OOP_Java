import java.util.Scanner;

class task_3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows");
		int row= input.nextInt();
		System.out.println("Enter columns");
		int col = input.nextInt();
		int array1[][] = new int[row][col];
		int array2[][] = new int[row][col];
		
		System.out.println("Enter the first matrix");
		for (int i = 0 ; i < row ; i++)
		{
			for (int j = 0 ; j < col ; j++)
			{
				array1[i][j] = input.nextInt();

			}
		}
		System.out.println("Enter the second matrix");
		for (int i = 0 ; i < row ; i++)
		{
			for (int j = 0 ; j < col ; j++)
			{
					array2[i][j] = input.nextInt();
			}
		}
		System.out.println("Result");
		System.out.println((array1[0][0] + array2[0][0]) + "\t" + (array1[0][1] + array2[0][1]));
		System.out.println((array1[1][0] + array2[1][0]) + "\t" + (array1[1][1] + array2[1][1]));
		
} 	// End of main
}	// End of Class