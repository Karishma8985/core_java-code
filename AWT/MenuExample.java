import java.awt.*;  
class MenuExample  
{  
     MenuExample(){  // create constructor....
        // this is for creating menu list...
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu submenu=new Menu("Sub Menu");     // this will create submenu in menu.....  
         MenuItem i1=new MenuItem("Item 1");  
         MenuItem i2=new MenuItem("Item 2");  
         MenuItem i3=new MenuItem("Item 3");  
         MenuItem i4=new MenuItem("Item 4");  
         MenuItem i5=new MenuItem("Item 5");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  // we will create subpartical for menu.....
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  // size is for display screen
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  