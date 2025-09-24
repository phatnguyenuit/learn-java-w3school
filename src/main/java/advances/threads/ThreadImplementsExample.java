package advances.threads;

/**
 * @author PhatNguyen
 * @created 06/09/2025 - 21:26
 * @project learn-java-w3school
 */
public class ThreadImplementsExample implements Runnable {
    public void run() {
        System.out.println("Thread v2 is running...");
    }

    public static void main(String[] args) {
        ThreadImplementsExample threadImplementsExample = new ThreadImplementsExample();
        Thread thread = new Thread(threadImplementsExample);
        thread.start();
    }

}
