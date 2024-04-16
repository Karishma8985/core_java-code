import java.io.*;
import java.util.*;

public class runnable_string implements Runnable {
    public void run() {
        System.out.println(
                "Thread is created and running successfully...");
    }

    public static void main(String[] args) {
        // aligning GFG Class with
        // Runnable interface
        Runnable r1 = new runnable_string();
        Thread t1 = new Thread(r1, "My Thread");
        // Thread object started
        t1.start();
        // getting the Thread
        // with String Method
        String str = t1.getName();
        System.out.println(str);
    }
}
