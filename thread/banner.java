import java.awt.*;

public class banner extends Frame implements Runnable {

    String str = "Banner moving using Thread..... ";

    banner() {
        setLayout(null);
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void paint(Graphics g) {
        Font f = new Font("courier", Font.BOLD, 40);
        g.setFont(f);
        g.drawString(str, 10, 100);
    }

    public void run() {
        for (;;) {
            repaint();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }

            char ch = str.charAt(0);
            str = str.substring(1, str.length());

            str = str + ch;
        }
    }

    public static void main(String[] args) {
        banner b = new banner();
        b.setSize(700, 400);
        b.setTitle("mMy Banner");
        b.setVisible(true);
        Thread t = new Thread(b);
        t.start();

    }
}
