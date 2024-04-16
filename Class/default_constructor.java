// initialized the instance variable using a default constructor...
class Person2{
    String name;
    int age ;
    // default constructor
    Person2()
    {
        name = "Nitu";
        age = 34;
    }
    // method
    void display2()
    {
        System.out.println("Hello, I am "+name);
        System.out.println("my age is  "+age);
    }

}

public class default_constructor {
    public static void main(String args[]) {
        Person2 obj = new Person2();
        obj.display2();
        
    }
    
}
