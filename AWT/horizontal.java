import java.awt.*;

public class horizontal extends Frame {

   public horizontal() {
      super("Horizontal Scrollbar horizontal");

      // Create a panel with a preferred size larger than the frame
      Panel panel = new Panel();
      panel.setPreferredSize(new Dimension(200, 200));

      // Create a horizontal scrollbar and add it to a ScrollPane
      Scrollbar hbar = new Scrollbar(Scrollbar.HORIZONTAL);
      
      ScrollPane scrollPane = new ScrollPane();
      scrollPane.setBounds(100, 100, 50, 10); 
      scrollPane.add(panel);
      scrollPane.add(hbar);

      // Add the ScrollPane to the Frame
      add(scrollPane);

      // Set the size and make the Frame visible
      setSize(400, 300);
      setVisible(true);
   }

   public static void main(String[] args) {
      new horizontal();
   }
}
