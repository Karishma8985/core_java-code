import java.net.*;
import java.io.*;

public class multiserve implements Runnable {

    static ServerSocket ss;
    static Socket s;

    public void run() {
        String name = Thread.currentThread().getName();
        for (;;) {
            try {
                System.out.println("thread " + name + " ready to accept.......");
                s = ss.accept();
                System.out.println("thread " + name + " accepted a connectin.....");

                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("thread " + name + " conected you!!!!");
                ps.close();
                s.close();
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        multiserve ms = new multiserve();
        ss = new ServerSocket(999);

        Thread t1 = new Thread(ms, "One");
        Thread t2 = new Thread(ms, "Two");

        t1.start();
        t2.start();

    }
}
