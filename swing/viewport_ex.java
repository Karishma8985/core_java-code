import java.awt.*;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class viewport_ex extends JFrame {
  // Sample 02: Member Variable(s)
  JViewport jvp;

  public viewport_ex(String title) throws HeadlessException {
    super(title);
    // Sample 01: Set Size and Position
    setBounds(100, 100, 550, 500);
    Container ControlHost = getContentPane();
    ControlHost.setLayout(new BorderLayout());

    // Sample 03: Create a Button Grid
    JPanel ButtonGrid = new JPanel();
    ButtonGrid.setPreferredSize(new Dimension(500, 7000));
    ButtonGrid.setLayout(new FlowLayout());
    for (int i = 1; i < 5000; i++) {
      JButton btn = new JButton(i + "");
      ButtonGrid.add(btn);
    }
    // ControlHost.add(ButtonGrid, BorderLayout.CENTER);

    // Sample 04: Create Button Controller
    // Run 1: Remove Previous Line ControlHost.add(ButtonGrid, BorderLayout.CENTER);
    JPanel CommandPanel = new JPanel();
    JButton BtnUp = new JButton("Up");
    JButton BtnDown = new JButton("Down");
    CommandPanel.add(BtnUp);
    CommandPanel.add(BtnDown);
    ControlHost.add(CommandPanel, BorderLayout.SOUTH);

    // Sample 05: Create View Port for the Button Grid
    jvp = new JViewport();
    jvp.setView(ButtonGrid);
    ControlHost.add(jvp, BorderLayout.CENTER);

    // Sample 06: Handle Button UP
    BtnDown.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // 6.1 Get Current View Origin
        Point ViewOrigin = jvp.getViewPosition();

        // 6.2 New Origin
        if (ViewOrigin.y < 7000)
          ViewOrigin.y = ViewOrigin.y + 500;

        // 6.3 Pan the View
        jvp.setViewPosition(ViewOrigin);
      }
    });

    // Sample 07: Handle Button Down
    BtnUp.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // 7.1 Get Current View Origin
        Point ViewOrigin = jvp.getViewPosition();

        // 7.2 New Origin
        if (ViewOrigin.y > 0)
          ViewOrigin.y = ViewOrigin.y - 500;

        // 7.3 Pan the View
        jvp.setViewPosition(ViewOrigin);
      }
    });
  }

  public static void main(String[] args) {
    // Sample 07: Create Instance of JFrameDemo
    viewport_ex frame = new viewport_ex("JViewport - Scroll Content Example");
    frame.setVisible(true);
  }
}