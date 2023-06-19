public class MyRunnable implements Runnable {

    private int start;
    private int end;
    private int[] arr;
    private int sum;

    public int getSum() {
        return this.sum;
    }

    public MyRunnable(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    @Override
    public void run() {
        for(int i = start; i < end; i++) {
            sum += arr[i];
        }
    }
    
}
