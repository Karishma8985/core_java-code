import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphics_use extends JPanel {

    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = { Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    graphics_use() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radious = 20;
        // rainbow at bottom center
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int i = colors.length; i > 0; i--) {
            g.setColor(colors[i - 1]);
           // The standard equation of a circle is given by: 
           //(x-h)2 + (y-k)2 = r2. Where (h,k) is the coordinates of center of the circle and r is the radius.
            g.fillArc(centerX - i * radious, centerY - i * radious, i * radious
                    * 2, i * radious * 2, 0, 180);
    
                }
    }


    public static void main(String[] args) {
        graphics_use rainbow = new graphics_use();
        JFrame app = new JFrame();
        app.add(rainbow);
        app.setSize(400, 250);
        app.setVisible(true);
    }

}