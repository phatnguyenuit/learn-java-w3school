package advances.threads;

/**
 * @author PhatNguyen
 * @created 06/09/2025 - 21:23
 * @project learn-java-w3school
 */
public class ThreadExtendsExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadExtendsExample thread = new ThreadExtendsExample();
        thread.start();
    }

}
