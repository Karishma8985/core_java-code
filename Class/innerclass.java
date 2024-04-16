import java.io.*;
class bankacct
{
    private double bal;
    bankacct(double b)
    {
        bal=b;
    }
    void contact(double r) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enetr password");
        String passwd = br.readLine();
        if(passwd.equals("xyz123"))
        {
            Interest in =new Interest(r);
            in.calculateInterest();
        }
        else{
            System.out.println("Sorry, password not match");
        }
    }
}