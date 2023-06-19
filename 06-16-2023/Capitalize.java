import java.util.stream.Stream;

public class Capitalize {
    public static void main(String[] args) {
        String[] words = {"prakash", "sauri", "sathwika", "shashank", "vijay", "nithin"};
        String[] capitalized = Stream.of(words).map(ele -> capitalize(ele)).toArray(String[]::new);
        for(String str: capitalized) {
            System.out.print(str+" ");
        }
    }
    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
