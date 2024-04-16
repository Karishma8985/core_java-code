// program for multilevel inheritance in java
class one{
    void printone(){
        System.out.println("This is super class");
    }
}
class two extends one{
    void printtwo(){
        System.out.println("This is sub class");

    }
}
class three extends two{
    void printthree(){
        System.out.println("This is sub2 class");

    }
}
public class multilevel1 extends three {
    public static void main(String args[]) {
        multilevel1 m = new multilevel1();
        m.printone();
        m.printthree();
        m.printtwo();

    }
}

