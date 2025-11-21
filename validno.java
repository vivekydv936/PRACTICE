public class validno {
    public static void main(String[] args) {
        // String no ="12345";
        // if(no.length()==5 && no.charAt(0)!=0){
        int N =10000;
        int x= 1;
        int total =N*x;
        String totalStr = Integer.toString(total);
        if(totalStr.length()==5 && totalStr.charAt(0)!='0'){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
