public class Task1 {
    public static void main(String[] args) {
   int start = 3;
   int end = 100;
   
   for (int num=start; num<=end; num++){
    boolean isprime = true;
    for(int i=2; i<num; i++){
        if(num%i==0){
            isprime = false ;
            break;
        }
    }
    if(isprime){
        System.out.println(num);
    }
   }
}
}