class sample2{
    double sum(int a,int b){
        int result = a+b;
        return result;
    }
}
public class parameter_returntype {
    public static void main(String args[]) {
        sample2 s = new sample2();
        double x = s.sum(7,4);
        System.out.print("Sum : "+x);
    }
}