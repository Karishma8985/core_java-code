import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ExampleJScrollPane {

    // private static final long serialversUID = 1 L;
    private static void createdisplayGUI() {
        // Create and set up the window.
        final JFrame Frame = new JFrame("Scroll Pane Example");
        // Display the window.
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set flow layout for the frame
        Frame.getContentPane().setLayout(new FlowLayout());
        JTextArea textarea = new JTextArea(20, 20);
        JScrollPane TextAreascrollable = new JScrollPane(textarea);
        TextAreascrollable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        TextAreascrollable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Frame.getContentPane().add(TextAreascrollable);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createdisplayGUI();
            }
        });
    }
}