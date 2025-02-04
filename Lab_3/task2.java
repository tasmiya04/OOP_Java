public class task2 {
    public static void main(String[] args) {
        String text = "Tasmiya";
        String rev = "";
        System.out.println("text");
        for (int i=text.length()-1; i>=0; i--){
            rev=rev + text.charAt(i);
        }
        if(text.equals(rev)){
     System.out.println("its PALINDROME");
        }
    }
}
