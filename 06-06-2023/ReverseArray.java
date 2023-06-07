public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {18,22,7,31,24,20,29,18};
        System.out.println("Original Array: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nReversed Array: ");
        int[] rev = reverse(arr);
        for(int i: rev) {
            System.out.print(i + " ");
        }
    }
    public static int[] reverse(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];
        for(int i = 0; i < length; i++) {
            reversed[i] = arr[length - i - 1];
        }
        return reversed;
    }
}
