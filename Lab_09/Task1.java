class Task1 {
	public static String reverseString(String str) {
		String temp = "";
        
        for (int i=str.length()-1; i>=0; i--) {
        	temp += str.charAt(i);
        }
        return temp;
	} 
	public static void main (String[]args) {
		System.out.println("Reversed text: " + reverseString("hello"));
	}
}