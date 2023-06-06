public class AgeCategory {
    public static String category(int age) {
        if(age < 13)    return "Kid";
        else if(age >= 13 && age <= 19) return "Teen";
        else return "Adult";
    }
    public static void main(String[] args) {
        System.out.println(category(22));
    }
}