// importing awt class  
import java.awt.*;  
  
// class to construct a frame and containing main method    
public class CanvasExample    
{    
  // class constructor   
  public CanvasExample()    
  {    
  
    // creating a frame  
    Frame f = new Frame("Canvas Example");   
    // adding canvas to frame   
    f.add(new MyCanvas());    
  
    // setting layout, size and visibility of frame  
    f.setLayout(null);    
    f.setSize(400, 400);    
    f.setVisible(true);    
  }    
  
  // main method  
  public static void main(String args[])    
  {    
    new CanvasExample();    
  }    
}    
  
// class which inherits the Canvas class  
// to create Canvas  
class MyCanvas extends Canvas    
{    
        // class constructor  
        public MyCanvas() {    
        setBackground (Color.GRAY);    
        setSize(300, 200);    
     }    
  
     // paint() method to draw inside the canvas instead of main()
  public void paint(Graphics g)    
  {    
  
    // adding specifications  
    g.setColor(Color.blue);    
    g.drawOval(50, 50, 200,100);
  }    
}       
