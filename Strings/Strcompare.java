public class Strcompare {
    public static void main(String args[]) {
        String str = "Hello";
        String s = new String("Hello");

        if(str==s)
        {
            System.out.println("Both r same");
        }                                               // here ans ins not same bcoz when we create objects they r store at different address..
        else{
            System.out.println("Both r not same");
                                                        

        }
        
    }

}
