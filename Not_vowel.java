public class Not_vowel {
    public static void main(String[] args) {
        String s = "Kite Google BMW";
        String[] words = s.split(" ");
        
        for (String word : words) {
            boolean hasVowel = false;
            
           
            for (char c : word.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    hasVowel = true;
                    break;
                }
            }
            
           
            if (!hasVowel) {
                System.out.println(word);
            }
        }
    }
}
