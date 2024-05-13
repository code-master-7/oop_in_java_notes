public class ThreadExample {

    public static void main(String[] args) {
        // Create a new thread using a Runnable
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running Thread: " + Thread.currentThread().getName() + ", count: " + i);
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        };

        // Create and start the thread
        Thread thread1 = new Thread(task, "MyThread-1");
        thread1.start();

        // Main thread continues running
        for (int i = 0; i < 5; i++) {
            System.out.println("Running Main Thread, count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        // Optionally wait for the thread to finish
        try {
            thread1.join(); // Waits until thread1 completes
            System.out.println("Thread1 has finished.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread finished.");
    }
}