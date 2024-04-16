// AWT Example by Association

import java.awt.*;    
  
// class AWTExample2 directly creates instance of Frame class  
class frame_awt1
 {    
  
   // initializing using constructor  
   frame_awt1() {  
  
      // creating a Frame  
      Frame f = new Frame();  
  
      // creating a Label  
      Label l = new Label("Employee id:");   
  
      // creating a Button  
      Button b = new Button("Submit");  
  
      // creating a TextField  
      TextField t = new TextField();  
  
      // setting position of above components in the frame  
      l.setBounds(50, 70, 150, 30);  // set in screen from left and top...
      t.setBounds(30, 100, 150, 30);  // what ever is your  width here make sure little bit plus size in button left field
      b.setBounds(200, 100, 80, 30);  
  
      // adding components into frame    
      f.add(b);  
      f.add(l);  
      f.add(t);  
  
      // frame size 300 width and 300 height    
      f.setSize(300,300);  
  
      // setting the title of frame  
      f.setTitle("Employee info");   
          
      // no layout  
      f.setLayout(null);   
  
      // setting visibility of frame  
      f.setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
frame_awt1 awt_obj = new frame_awt1();    
  
}  
  
}    
