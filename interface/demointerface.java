
interface printable {  // interface declaration
   void print(); // initializing function declared in class
}
public class demointerface implements printable {  // child class implementing interface 'printable' declared
   public void print(){ // print function declared to print output
      System.out.println("Hello Readers"); // printing output
   }
   public static void main(String[] args) {  // main function declaration
      demointerface obj = new demointerface(); // creating object of class
        obj.print(); // function calling using class object
    }
}