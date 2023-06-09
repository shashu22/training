public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java J2EE Reverse Me";
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        String[] strArr = str.split(" ");
        String[] newArr = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            newArr[i] = rev(strArr[i]);
        }
        return String.join(" ", newArr);
    }
    public static String rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        return String.valueOf(sb.reverse());
    }
}
