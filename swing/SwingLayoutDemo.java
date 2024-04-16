import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingLayoutDemo {

    private JFrame mFrame; // main frame
    private JLabel hLabel; // header label
    private JLabel sLabel; // status label
    private JPanel cPanel; // controlpanel
    private JLabel msglabel;

    public SwingLayoutDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingLayoutDemo sLD = new SwingLayoutDemo();
        sLD.showBorderLayoutDemo();
    }

    private void prepareGUI() {
        mFrame = new JFrame("Java SWING Examples");
        mFrame.setSize(400, 400);
        mFrame.setLayout(new GridLayout(3, 1));

        hLabel = new JLabel("", JLabel.CENTER);
        sLabel = new JLabel("", JLabel.CENTER);
        sLabel.setSize(350, 100);

        mFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        cPanel = new JPanel();
        cPanel.setLayout(new FlowLayout());

        mFrame.add(hLabel);
        mFrame.add(cPanel);
        mFrame.add(sLabel);
        mFrame.setVisible(true);
    }

    private void showBorderLayoutDemo() {
        hLabel.setText("Layout in action: BorderLayout");

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300, 300);
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);

        panel.setLayout(layout);
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        panel.add(new JButton("Line Start"), BorderLayout.LINE_START);
        panel.add(new JButton("Line End"), BorderLayout.LINE_END);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);

        cPanel.add(panel);
        mFrame.setVisible(true);
    }
}