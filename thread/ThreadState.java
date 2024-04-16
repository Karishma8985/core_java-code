import java.io.*;
import java.util.*;

class different_state implements Runnable {
    public void run() {
        // implementing try-catch Block to set sleep state
        // for inactive thread
        try {
            Thread.sleep(102);
        } catch (InterruptedException i1) {
            i1.printStackTrace();
        }
        System.out.println(
                "\n The state for t1 after it invoked join method() on thread t2"
                        + " " + ThreadState.t1.getState());

        // implementing try-catch block
        try {
            Thread.sleep(202);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
    }
}

// creation of ThreadState class
// to implement Runnable interface
public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState o1;

    public static void main(String args[]) {
        o1 = new ThreadState();
        t1 = new Thread(o1);
        System.out.println("\npost-spanning, state of t1 is"
                + " " + t1.getState());
        // lets invoke start() method on t1
        t1.start();
        // Now,Thread t1 is moved to runnable state
        System.out.println(
                "\npost invoking of start() method, state of t1 is"
                        + " " + t1.getState());
    }

    public void run() {
        different_state ds = new different_state();
        Thread t2 = new Thread(ds);
        // Thread is created and its in new state.
        t2.start();
        // Now t2 is moved to runnable state
        System.out.println(
                "\nstate of t2 Thread, post-calling of start() method is"
                        + " " + t2.getState());
        // create a try-catch block to set t1 in waiting
        // state
        try {
            Thread.sleep(202);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        System.out.println(
                "\nState of Thread t2 after invoking to method sleep() is"
                        + " " + t2.getState());
        try {
            t2.join();
            System.out.println(
                    "\nState of Thread t2 after join() is"
                            + " " + t2.getState());
        } catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        System.out.println(
                "\nstate of Thread t1 after completing the execution is"
                        + " " + t1.getState());
    }
}
