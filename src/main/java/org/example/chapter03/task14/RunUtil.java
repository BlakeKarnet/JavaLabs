package main.java.org.example.chapter03.task14;

public class RunUtil {
    public static Runnable inOrder(Runnable... tasks) {
        return () -> {
            for (Runnable task : tasks) {
                task.run();
            }
        };
    }
}