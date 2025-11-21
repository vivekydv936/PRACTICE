public class The_Last_word {
    public static boolean isSpecial(char c){
        return c==' '|| c =='#'|| c=='&'|| c=='*';

    }
    public static void main(String[] args) {
        String s="word hello *&#";
        int i=s.length()-1;
        int lenght =0;
        while(i>=0 && isSpecial(s.charAt(i)) ){
                i--;
        }
        while(i>=0 && !isSpecial(s.charAt(i)) ){
            lenght++;
                i--;
        }
        System.out.println(lenght);
    }
}
