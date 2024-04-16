public class string_array {
    public static void main(String args[])
    {
        String str = "Hello, this is a book on java";

        char arr[]= new char[20];

        //copy from str into ass starting from 7th character to 20th characters.....

        str.getChars(7, 21, arr, 0);

        System.out.println(arr);
    }
    
}
