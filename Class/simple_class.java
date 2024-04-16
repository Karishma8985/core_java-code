//initialize the instance variables

class person1
{
    // properties - instance variables
    String name;
    int age;

    // actions - method
    void talk()
    {
        System.out.println("Hello, I m "+name);
        System.out.println("my age is "+age);

    }
}
class simple_class
{
    public static void main(String args[]) {

        // create person class object: raju

        person1 raju = new person1();
        raju.name = "Raju";
        raju.age = 34;
        raju.talk();

        
    }
}