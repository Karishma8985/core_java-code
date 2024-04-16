//Accessor amd mutator method
class person{
    // instance variables
    String name;
    int age;

    // declare mutator methods
    void setname(String name){
        this.name=name;
    }

    void setage(int age){
        this.age=age;
    }
    // declare accessor method

    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
}
public class instanse_method {
    public static void main(String args[])
    {
        // sreate object for class
        person p =new person();
        p.setname("Neha");
        p.setage(34);
        System.out.println("Name: "+p.getname());
        System.out.println("age: "+p.getage());

    }
    
}
