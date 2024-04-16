// static method accessing static vatiable
class statica{
    static int x=77;

    static void ace(){
        System.out.println("X: "+x);
    }
}
public class static_var {
    public static void main() {
        statica.ace();
    }
}
