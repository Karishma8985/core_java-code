import java.util.*;
// program run by 3 different program... 1. it self     2. ADD.JAVA  3. PRRINT.JAVA
// all file should be in same folder......
public class add_value_2class{
    public static void main(String args[]){
        add obj = new add();    // create object for first add class
        int ab=obj.input();     // input is a function declare in add class
        prrint ok=new prrint(); // create new variable and give value to another class prrint class
        ok.prn(ab);             // call class and print it...
             
    }
}



