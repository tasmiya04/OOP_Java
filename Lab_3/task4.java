public class task4 {
        public static void main(String[] args) {
            int i=0;
            int [] arr = new int [10];
            do{
                arr[i] = i*i;
                i++;
            }while(i<arr. length);
            int j=0;int sum=0;
            while(j<arr. length){
                if(arr[j]==81){
                    break;
                }
                if(arr[j]%2 !=0){
                    sum = sum + arr[j];
                }
                j++;
            }
            System.out.println(sum);
}
}
