public class Substring {
    public static void main(String[] args) {
        String str = "JavaJ2eeStrutsHibernate";
        String rotatedStr = "StrutsHibernateJavaJ2ee";
        int i = 0;
        while(i < str.length()) {
            if(rotatedStr.equals(rotate(str, i))) {
                System.out.println("The strings "+str+" and "+rotatedStr+" are rotated strings of each other");
                break;
            }
            i++;
        }
        if(i == str.length())
            System.out.println("The strings "+str+" and "+rotatedStr+" are not rotated strings of each other");
    }
    public static String rotate(String str, int pos) {
        return str.substring(pos) + str.substring(0, pos);
    }
}
