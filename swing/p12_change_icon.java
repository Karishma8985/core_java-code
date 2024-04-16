import javax.swing.*;
import java.awt.*;

class p12_change_icon {
    p12_change_icon() {
        JFrame f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("image/login.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new p12_change_icon();
    }
}