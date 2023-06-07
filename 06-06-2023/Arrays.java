public class Arrays {
    public static void main(String[] args) {
        System.out.print("Largest element in {");
        int arr[] = {18,22,7,31,24,20,29,18};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("} is " + largestAndSmallest(arr)[1]);
        System.out.print(" and smallest element is " + largestAndSmallest(arr)[0]);
    }

    private static int[] largestAndSmallest(int[] arr) {
        int max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i])    max = arr[i];
            if(min > arr[i])    min = arr[i];
        }
        return new int[] {min, max};
    }
}