import java.io.*;
import java.util.*;

public class Extended_thread extends Thread {
    // initiated run method for Thread
    public void run() {
        System.out.println("Thread Started Running...");
    }

    public static void main(String[] args) {
        Extended_thread et1 = new Extended_thread();

        // Invoking Thread using start() method
        et1.start();
    }
}
