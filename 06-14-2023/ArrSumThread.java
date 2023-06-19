public class ArrSumThread {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        
        MyRunnable run1 = new MyRunnable(0, 20, arr);
        Thread t1 = new Thread(run1);
        t1.start();

        MyRunnable run2 = new MyRunnable(20, 40, arr);
        Thread t2 = new Thread(run2);
        t2.start();
        
        MyRunnable run3 = new MyRunnable(40, 60, arr);
        Thread t3 = new Thread(run3);
        t3.start();
        
        MyRunnable run4 = new MyRunnable(60, 80, arr);
        Thread t4 = new Thread(run4);
        t4.start();
        
        MyRunnable run5 = new MyRunnable(80, 100, arr);
        Thread t5 = new Thread(run5);
        t5.start();

        while(t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive() || t5.isAlive()) {}

        int finalSum = run1.getSum() + run2.getSum() + run3.getSum() + run4.getSum() + run5.getSum();

        System.out.println("Total Sum is: " +finalSum);
        
    }
}