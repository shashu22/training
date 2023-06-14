public class ThreadImpl extends Thread {
    @Override
    public void run() {
        for(int i = 1; i < 11; i++) {
            System.out.println("Thread Class - " +i);
        }
    }
}
