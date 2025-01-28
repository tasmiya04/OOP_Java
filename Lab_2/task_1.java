import java.util.Scanner;

class task_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char const_arr[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		System.out.println("Enter the Consonant");
		char consonant = input.next().charAt(0);
		boolean isConst = false;
		for(int i = 0; i < const_arr.length ; i++)
		{
			if (consonant == const_arr[i])
			{
				isConst = true;
				break;
			}
		} // End of Loop
		if (isConst)
		{
			System.out.println("This Consonant is present");
		}
		else
		{
			System.err.println("Write correct Consonant");
		}
	} 	// End of main
}	// End of Class