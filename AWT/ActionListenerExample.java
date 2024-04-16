// Java ActionListener Example: On Button click
import java.awt.*;  
import java.awt.event.*;  
//1st step  
public class ActionListenerExample implements ActionListener{  
    public static Button b;     //for accessing globally through out whole program...
    public static TextField tf;
    ActionListenerExample()     // default constrctor...
    {
        Frame f=new Frame("ActionListener Example");  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        b=new Button("Click Here");  
        b.setBounds(50,100,60,30);  
        //2nd step  
        b.addActionListener(this);  
        f.add(b);
        f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){  
        tf.setText("Welcome to Javatpoint.");  
} 
public static void main(String[] args) {  
      new ActionListenerExample();
}  
 
}  