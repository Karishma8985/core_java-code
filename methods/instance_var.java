class testa{
    int x=10;
    void display(){
        System.out.println("X: "+x);
    }
}
public class instance_var {
    public static void main(String args[]) {
        testa t = new testa();
        testa t1 = new testa();
        
        ++t.x;

    }
}