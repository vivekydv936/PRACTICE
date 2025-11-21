public class Claculate_sum {
  
    public static int sumcalculate(int num,int k){
    int sum=0;
        while(num>0){
            int ld =num%10;
            sum=sum +ld;
            num=num/10;
        }
        
        return sum*k;
} 

        public static int findsingle(int new_sum){
            int sum=0;
            while(new_sum>0){
            int ld =new_sum%10;
            sum=sum +ld;
            new_sum=new_sum/10;
          }
          if (sum >9){
            return findsingle(sum);
          }
          else {
            return sum;
          }
          
        }

   public static void main(String[] args) {
    int num=9875;
    int k=4;
   int new_sum=sumcalculate(num, k);
   System.out.println(findsingle(new_sum));

   }
    
}


