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
public class multilevel extends two {
    public static void main(String args[]) {
        multilevel m = new multilevel();
        m.printone();
        m.printtwo();
        
    }
}
