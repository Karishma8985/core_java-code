
import javax.swing.*;

public class p11_java_table {
    JFrame f;

    p11_java_table() {
        f = new JFrame();
        String data[][] = { { "101", "Amit", "670000" },
                { "102", "Jai", "780000" },
                { "103", "Sachin", "50000" },
                { "104", "Sumit", "60000" },
                { "105", "Nilay", "7800" },
                { "106", "Neeta", "10000" },
                { "112", "Dipak", "10000" } };
        String column[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new p11_java_table();
    }
}
