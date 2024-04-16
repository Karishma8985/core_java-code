// program for no parameter but with return type
class sample1{
    int num1,num2;

    sample1(int a, int b){
        num1=a;
        num2=b;
    }

    int sum(){
        int result = num1+num2;
        return result;
    }
}
public class nopara_return {
    public static void main(String args[]) {
        int a;
        sample1 s = new sample1(23, 23);
        a=s.sum();
        System.out.println("Sum: "+a);
    }
}
