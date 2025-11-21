public class Abrevaition_18 {
    public static boolean checkfn(String word,String abre){

        if((abre.length())<3 && (abre.length())>5){
            return false;
        }
        int n1 =word.length();
        int n2 =abre.length();
        int j =0;
        int i =0;
        while( i<n1 && j<n2){
            if(word.charAt(i)==abre.charAt(j)){
                j++;
            }
                i++;
        }


        return   j==n2;
    }
    public static void main(String[] args) {
        String word ="Boulevaed";
        String abbre ="Bldv";

      
        System.out.println(checkfn(word,abbre));
 
    }
}
