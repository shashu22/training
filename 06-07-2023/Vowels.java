public class Vowels {
    public static void main(String[] args) {
        String str = "Shashank";
        System.out.println("Number of vowels in " + str + " is " + noOfVowels(str));
    }
    public static int noOfVowels(String str) {
        String vowelString = "aeiouAEIOU";
        int vowelCount = 0;
        for(int i = 0; i  < str.length(); i++) {
            if(vowelString.contains(String.valueOf(str.charAt(i)))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
