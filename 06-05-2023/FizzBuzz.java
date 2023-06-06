public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1, 100);
    }
    public static void fizzBuzz(int lowerLimit, int upperLimit) {
        int i = lowerLimit;
        while(i <= upperLimit) {
            if(i%3 == 0 && i%5 == 0)
                System.out.print("FizzBuzz ");
            else if(i%3 == 0)
                System.out.print("Fizz ");
            else if(i%5 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i+" ");
            
            i++;
        }
    }
}