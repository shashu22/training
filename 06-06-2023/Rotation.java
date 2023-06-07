public class Rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nLeft Shifted Array: ");
        int[] rev = rotate(arr, 2);
        for(int i: rev) {
            System.out.print(i + " ");
        }
    }
    public static int[] rotate(int[] arr, int pos) {
        int[] temp = new int[pos];
        int len = arr.length;
        for(int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        for(int i = pos; i < len; i++) {
            arr[i - pos] = arr[i];
        }
        for(int i = len - pos; i < len; i++) {
            arr[i] = temp[i - len + pos];
        }
        return arr;
    }
}
