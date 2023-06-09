import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "aab", str2 = "aba";
        System.out.println("The words " +str1+ " and " +str2+ " are " +(isAnagram(str1, str2) ? "anagrams" : "not anagrams"));        
    }
    public static boolean isAnagram(String str1, String str2) {

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        
        if(String.valueOf(char1).equals(String.valueOf(char2))) return true;

        return false;
    }
}
