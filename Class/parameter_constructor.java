// initializing  the instance variable using a parameterized constructor

class Person{

    // instance variables
    String name;
    int age;

    // default constructor
    Person()
    {
        name = "Kapil";
        age = 27;
    }

    //parameterized constructor
    Person(String s, int i)
    {
        name = s;
        age = i;
    }
    // method
    void display()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
public class parameter_constructor {
    public static void main(String args[]) 
    {
        // default parameters
        Person p = new Person();
        p.display();

        // parameter constructor
        Person p1 = new Person("sita",34);
        p1.display();
                
    }
}
