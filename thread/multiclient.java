import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class multiclient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 999);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        s.close();
    }
}
