
class TransformString {
    public static void main(String[] args) {
        String s="abc12AD34@##123";
        StringBuilder letter= new StringBuilder();
        StringBuilder digits= new StringBuilder();
        StringBuilder uppToLOwer= new StringBuilder();
        StringBuilder Special= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isLowerCase(ch)){
                letter.append(ch);
            }
            if(Character.isDigit(ch)){
                digits.append(ch);
            }
            if(Character.isUpperCase(ch)){
                uppToLOwer.append(Character.toLowerCase(ch));
            }
            else{
                Special.append(ch);
            }

        }

        String result;
        result =letter.toString()+digits.toString()+uppToLOwer.toString()+Special.toString();
        System.out.println(result);
        



    }
}
