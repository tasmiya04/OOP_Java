import java.util.Scanner;

class task_4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name[] = new String[6];
		String ali = "ali";

		boolean isName = false;
		for (int i = 0 ; i < name.length ; i++)
		{
			System.out.println("Enter the name "+ i + ": ");
			name[i] = input.nextLine();
			if (name[i].equals(ali))
			{
				isName =  true;
			}
		}
		if (isName)
		{
			System.out.println("Ali is Availible");
		}
		else
		{
			System.err.println("Ali isn't Availible");
		}
	} 	// End of main
}	// End of Class