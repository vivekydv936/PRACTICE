public class all_armstrong {


    public static int digitcalculator(int num){
        int count=0;
            while(num>0){
            int ld =num%10;
            
            num=num/10;
            count++;

            }
            return count;
    }
    public static void main(String[] args) {
        
            int num=100;
            int upp=999;
            int n=digitcalculator(num);
        
        for(int i=num;i<upp;i++){
            int sum =0;
            int temp =i;
            while(temp>0){
            int ld =temp%10;
            sum= (int) (sum + Math.pow(ld, n));
            temp=temp/10;
              }
            if(sum==i){System.out.println(sum); }


        }

    }
}
