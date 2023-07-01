import java.net.*;
import java.util.*;
import java.io.*;
import java.io.IOException;

public class fiboSR {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("waiting..");
        Socket s = ss.accept();

        System.out.println("Connected..");

        InputStreamReader dis = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(dis);

        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("Entered number is: " + num);//got number from client which terms wanted to print in fibonacci...

        int i, ans, j;

        i = 0;
        j = 1;

        for (int k = 1; k <= num; k++) {
            System.out.println("Fibo series is: " + i);
            PrintStream pw = new PrintStream(s.getOutputStream());
            pw.println(i);
            ans = i + j;
            i = j;
            j = ans;

        }

    }

}