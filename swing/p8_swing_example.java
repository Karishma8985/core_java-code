import java.awt.*;

import javax.swing.*;

public class p8_swing_example {
    /**
     * 
     */
    p8_swing_example() {

        // set frame with title
        final JFrame a = new JFrame("Java Swing Example");

        a.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 40, 200));
        JTextArea textarea = new JTextArea(50, 50);
        JScrollPane TextAreascrollable = new JScrollPane(textarea);
        TextAreascrollable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        TextAreascrollable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        a.getContentPane().add(TextAreascrollable);
        // set button
        JButton b = new JButton("click me");
        b.setBounds(30, 30, 100, 30);
        // set textfield
        JTextField tf = new JTextField("text field");
        tf.setBounds(150, 30, 100, 30);
        // set scroll pane
        JScrollBar scr = new JScrollBar();
        scr.setBounds(420, 30, 40, 420);

        // set menu
        JMenu menu;
        JMenuItem a1, a2;

        menu = new JMenu("options");
        JMenuBar m1 = new JMenuBar();
        a1 = new JMenuItem("example");
        a2 = new JMenuItem("example1");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);

        // set list
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("first item");
        l.addElement("second item");
        JList<String> jl = new JList<>(l);
        jl.setBounds(30, 80, 75, 75);

        // set label
        JLabel b1;
        b1 = new JLabel("this is sample code");
        b1.setBounds(125, 80, 130, 30);

        // set combo box
        String courses[] = { "core java", "advance java", "java servlet" };
        JComboBox cb = new JComboBox(courses);
        cb.setBounds(270, 80, 120, 30);

        // add comppnants to fram and set frame
        a.add(b);
        a.add(tf);
        a.add(scr);

        a.setJMenuBar(m1);
        a.add(jl);
        a.add(b1);
        a.add(cb);
        a.setSize(500, 500);
        a.setLayout(null);
        a.setVisible(true);

    }

    public static void main(String args[]) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                new p8_swing_example();
            }
        });

    }
}