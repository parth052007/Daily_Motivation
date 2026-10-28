
import java.util.Map;

public class threaddemo {

    public static void main(String[] args) throws InterruptedException {

        // 1. currentThread(), getName(), getId()/threadId()
        Thread mainThread = Thread.currentThread();

        System.out.println("===== MAIN THREAD =====");
        System.out.println("Thread Name: " + mainThread.getName());
        System.out.println("Thread ID: " + mainThread.threadId());
        System.out.println("Thread State: " + mainThread.getState());
        System.out.println("Thread Priority: " + mainThread.getPriority());
        System.out.println("Is Daemon: " + mainThread.isDaemon());

        // 2. Creating a thread and using start(), run(), setName()
        Thread t1 = new Thread(() -> {
            System.out.println("\n===== T1 RUNNING =====");
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());

            System.out.println("Task started");

            // 3. sleep()
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("T1 interrupted");
                return;
            }

            System.out.println("Task finished");
        });

        t1.setName("Worker-1");

        System.out.println("\n===== BEFORE START =====");
        System.out.println("Name: " + t1.getName());
        System.out.println("State: " + t1.getState());
        System.out.println("Alive: " + t1.isAlive());

        t1.start();

        // 4. isAlive() and getState()
        System.out.println("\n===== AFTER START =====");
        System.out.println("Alive: " + t1.isAlive());
        System.out.println("State: " + t1.getState());

        // 5. join()
        t1.join();

        System.out.println("\n===== AFTER JOIN =====");
        System.out.println("Alive: " + t1.isAlive());
        System.out.println("State: " + t1.getState());

        // 6. Demonstrating run() versus start()
        System.out.println("\n===== RUN VS START =====");

        Thread t2 = new Thread(() -> {
            System.out.println("Executed by: "
                    + Thread.currentThread().getName());
        }, "Worker-2");

        t2.run();   // Executes on main thread
        t2.start(); // Executes on a new thread
        t2.join();

        // 7. Interrupt status methods
        System.out.println("\n===== INTERRUPT METHODS =====");

        Thread t3 = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("T3 working...");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                System.out.println("T3 received interruption");
                Thread.currentThread().interrupt();
            }

            System.out.println("T3 interrupt status: "
                    + Thread.currentThread().isInterrupted());
        }, "Worker-3");

        t3.start();

        Thread.sleep(500);
        t3.interrupt();
        t3.join();

        // 8. interrupted() checks and clears current thread's status
        System.out.println("\n===== INTERRUPTED() =====");

        Thread.currentThread().interrupt();

        System.out.println("First check: " + Thread.interrupted());
        System.out.println("Second check: " + Thread.interrupted());

        // 9. Thread priority
        System.out.println("\n===== PRIORITY =====");

        Thread t4 = new Thread(() -> {
            System.out.println("Priority worker running");
        });

        t4.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority: " + t4.getPriority());

        t4.start();
        t4.join();

        // 10. Daemon thread
        System.out.println("\n===== DAEMON THREAD =====");

        Thread t5 = new Thread(() -> {
            System.out.println("Daemon thread running");
        }, "Daemon-Worker");

        t5.setDaemon(true);
        System.out.println("Is daemon: " + t5.isDaemon());

        t5.start();
        t5.join();

        // 11. Uncaught exception handler
        System.out.println("\n===== EXCEPTION HANDLER =====");

        Thread t6 = new Thread(() -> {
            throw new RuntimeException("Demo exception");
        }, "Error-Worker");

        t6.setUncaughtExceptionHandler((thread, error) -> {
            System.out.println("Thread: " + thread.getName());
            System.out.println("Error: " + error.getMessage());
        });

        t6.start();
        t6.join();

        // 12. holdsLock()
        System.out.println("\n===== HOLDS LOCK =====");

        Object lock = new Object();

        synchronized (lock) {
            System.out.println(
                    "Inside synchronized: "
                    + Thread.holdsLock(lock));
        }

        System.out.println(
                "Outside synchronized: "
                + Thread.holdsLock(lock));

        // 13. getStackTrace()
        System.out.println("\n===== STACK TRACE =====");

        for (StackTraceElement element :
                Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }

        // 14. getAllStackTraces()
        System.out.println("\n===== ALL THREAD STACK TRACES =====");

        Map<Thread, StackTraceElement[]> traces =
                Thread.getAllStackTraces();

        for (Thread thread : traces.keySet()) {
            System.out.println("Thread: " + thread.getName());
        }

        // 15. dumpStack()
        System.out.println("\n===== DUMP STACK =====");
        Thread.dumpStack();

        // 16. onSpinWait() demonstration
        System.out.println("\n===== SPIN WAIT HINT =====");

        for (int i = 0; i < 3; i++) {
            Thread.onSpinWait();
            System.out.println("Spin iteration: " + i);
        }

        // 17. yield() demonstration
        System.out.println("\n===== YIELD =====");

        Thread t7 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("T7: " + i);
                Thread.yield();
            }
        }, "Yield-Worker");

        t7.start();
        t7.join();

        // 18. getThreadGroup()
        System.out.println("\n===== THREAD GROUP =====");

        System.out.println(
                "Group: " + t7.getThreadGroup().getName());

        // 19. Context class loader
        System.out.println("\n===== CLASS LOADER =====");

        System.out.println(
                "ClassLoader: " + t7.getContextClassLoader());

        // 20. Default uncaught exception handler
        System.out.println("\n===== DEFAULT HANDLER =====");

        Thread.setDefaultUncaughtExceptionHandler(
                (thread, error) -> {
                    System.out.println(
                            "Default handler: " + thread.getName());
                });

        Thread t8 = new Thread(() -> {
            throw new RuntimeException("Another demo exception");
        }, "Default-Handler-Worker");

        t8.start();
        t8.join();

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}
