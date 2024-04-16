import java.awt.*;
import java.awt.event.*;;  

public class ToolkitExample1 {
   public static void main(String[] args) {  
        Frame f=new Frame("ToolkitExample1");  
        Button b=new Button("beep");  
        b.setBounds(50,100,60,30);  // size of button
        f.add(b);     
        f.setSize(300,300);  // size of screen...
        f.setLayout(null);  
        f.setVisible(true);  
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                Toolkit.getDefaultToolkit().beep();  
            }  
        });       
    }  
}     

