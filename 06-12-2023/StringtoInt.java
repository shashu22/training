public class StringtoInt {
    public static void main(String[] args) {
        try {
            System.out.println("Converted number is: " +convert("test"));
        }
        catch(NumberFormatException e) {
            System.out.println("Conversion Failed");
            e.printStackTrace();
        }
    }
    public static float convert(String str) throws NumberFormatException {
        return Float.parseFloat(str);
    }
}
