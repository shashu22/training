public class CustomExpImpl {
    public static void main(String[] args) {
        int age = 17;
        try {
            if(isAdult(age))    System.out.println("Person is an Adult");
        }
        catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean isAdult(int age) throws CustomException {
        if(age < 18)    throw new CustomException("Invalid Age");
        else    return true;
    }
}
