public class Main {
    public static void main(String[] args) {
        ThreadImpl thread1 = new ThreadImpl();
        
        RunnableImpl runnable = new RunnableImpl();
        Thread thread2 = new Thread(runnable);
        
        thread1.start();
        thread2.start();
    }
}
