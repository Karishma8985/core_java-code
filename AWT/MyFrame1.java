// program for create a frame by creating an object to frame class....

import java.awt.*;
public class MyFrame1
{
    public static void main(String args[]) {
        Frame f = new Frame("My AWT Frame");        // create a frame
        f.setSize(300,250);         // set size of frame(width,height)
        f.setVisible(true);                 // to showing frame...
    }
}
