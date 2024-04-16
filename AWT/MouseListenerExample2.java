import java.awt.*;  
import java.awt.event.*;  
public class MouseListenerExample2 extends Frame implements MouseListener{  
    MouseListenerExample2(){  
        addMouseListener(this);  
          
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mouseEntered(MouseEvent e) {
        Graphics g=getGraphics();  
        g.setColor(Color.RED);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mouseExited(MouseEvent e) {
        Graphics g=getGraphics();  
        g.setColor(Color.cyan);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mousePressed(MouseEvent e) {
        Graphics g=getGraphics();  
        g.setColor(Color.pink);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mouseReleased(MouseEvent e) {
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
      
public static void main(String[] args) {  
    new MouseListenerExample2();  
}  
}  