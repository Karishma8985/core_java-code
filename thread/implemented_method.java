import java.io.*;
import java.util.*;

public class implemented_method implements Runnable {
    // method to start Thread
    public void run() {
        System.out.println(
                "Thread is Running Successfully");
    }

    public static void main(String[] args) {
        implemented_method imt1 = new implemented_method();
        // initializing Thread Object
        Thread t1 = new Thread(imt1);
        t1.start();
    }
}
