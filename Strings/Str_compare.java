public class Str_compare {
    public static void main(String args[]) {
        
        String s1="ABCD";  
        String s2="ABCD";  
        String s3=new String("ABCD");  
        String s4="Abdc";  
        System.out.println(s1.equals(s2));//True 
        System.out.println(s1.equals(s3));//true  
        System.out.println(s1.equals(s4));//false  

        System.out.println(s1.equalsIgnoreCase(s2));//true  
       
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s4));//1(because s1>s3)  
        System.out.println(s4.compareTo(s1));//-1(because s3 < s1 )  
        
        System.out.println(s1==s2);//true (because both refer to same instance)  
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
    
    }  
}  
    
