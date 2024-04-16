
//Java event handling by outer class
import java.awt.*;

class AEvent2 extends Frame{  
        TextField tf;  
            // default constructor
        AEvent2(){  
            //create components  
        tf=new TextField();  
        tf.setBounds(60,50,170,20);  
        
        Button b=new Button("click me");  
        b.setBounds(100,120,80,30);  
            //register listener  
        Outer o=new Outer(this);            // calling  outer class from another file...
        b.addActionListener(o);//passing outer class instance  
            //add components and set size, layout and visibility  
        add(b);add(tf);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
public static void main(String args[]){  
new AEvent2();  
}  
}
