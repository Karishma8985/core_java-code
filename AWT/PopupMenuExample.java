import java.awt.*;  
import java.awt.event.*;  
class PopupMenuExample  
{  
     PopupMenuExample(){    // default constructor
         final Frame f= new Frame("PopupMenu Example");  
         final PopupMenu popupmenu = new PopupMenu("Edit");   
         MenuItem cut = new MenuItem("Cut");  
         cut.setActionCommand("Cut");
         
           //SetActionCommand()    This method changes the action command string, but does not affect the string used to label the button.        getActionCommand()   The action command identifies the button. Thus, when using two or more buttons within the same application, the action command gives you an easy way to determine which button was pressed.
        
         MenuItem copy = new MenuItem("Copy");  
         copy.setActionCommand("Copy");  
         MenuItem paste = new MenuItem("Paste");  
         paste.setActionCommand("Paste");      
         popupmenu.add(cut);  
         popupmenu.add(copy);  
         popupmenu.add(paste);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
         f.add(popupmenu);   
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
     }  
public static void main(String args[])  
{  
        new PopupMenuExample();  
}  
}  