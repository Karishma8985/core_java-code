import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class p2_radiobutton extends JFrame implements ActionListener {
    JRadioButton eng, doc;
    ButtonGroup bg;
    JTextField jtf;
    JCheckBox bcd, ccb, acb;
    JTextArea jta;

    p2_radiobutton() {
        eng = new JRadioButton("Engineer");

        doc = new JRadioButton("Doctor");
        bg = new ButtonGroup();
        bg.add(eng);
        bg.add(doc);
        jtf = new JTextField(20);
        bcd = new JCheckBox("Bike");
        ccb = new JCheckBox("Car");
        acb = new JCheckBox("Aeroplane");
        jta = new JTextArea(3, 20);
        Container c = this.getContentPane();
        // setLayout(new FlowLayout( default set in center
        // c.setLayout(new FlowLayout(FlowLayout.LEFT)); set in left align, if we write
        // right set in right align
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250, 100);
        SpinnerModel value = new SpinnerNumberModel(3, // initial value
                0, // minimum value
                10, // maximum value
                1); // step
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 300, 50, 30);
        add(spinner);
        add(label);
        // Registering the listeners with the components
        eng.addActionListener(this);
        doc.addActionListener(this);
        bcd.addActionListener(this);
        ccb.addActionListener(this);
        acb.addActionListener(this);
        c.add(eng);
        c.add(doc);
        c.add(jtf);
        c.add(bcd);
        c.add(ccb);
        c.add(acb);
        c.add(jta);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Selection Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value : " + ((JSpinner) e.getSource()).getValue());
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == eng) {
            jtf.setText("You are an Engineer");
        }
        if (ae.getSource() == doc) {
            jtf.setText("You are an Doctor");
        }
        String str = " ";
        if (bcd.isSelected()) {
            str += "Bike\n";
        }
        if (ccb.isSelected()) {
            str += "Car\n";
        }
        if (acb.isSelected()) {
            str += "Aeroplane\n";
        }
        jta.setText(str);

        // spinner example
    }

    public static void main(String[] args) {
        new p2_radiobutton();
    }
}