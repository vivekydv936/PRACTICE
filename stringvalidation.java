public class stringvalidation {
    public static void main(String[] args) {
        String str ="abe#&";
        Boolean markh=false;
        Boolean marka=false;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if((ch== '#')&&(str.length()%2==0)){
               
                    marka= true;
                }
                if((ch=='&')&&(str.length()%2==0)){
                    markh=  true;
                }
               
            }
            if(marka &&markh){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
    }
}
