import java.net.*;
import java.io.*;
import java.util.*;

public class loopserver {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("waiting: ");
        Socket s = ss.accept();
        System.out.println("connected:");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("server: ");
        String str = br.readLine();
        int str2 = Integer.parseInt(str);
        System.out.println("client number is " + str2);//got integer by client

        int sum2 = str2 + 5;

        String sum3 = Integer.toString(sum2);
        System.out.println("after convert to string: " + sum3);
        PrintWriter pw = new PrintWriter(s.getOutputStream());

        for (int i = 1; i <= 5; i++) {

            System.out.println(sum3);
            pw.println(sum3);
            pw.flush();

        }
    }
}
