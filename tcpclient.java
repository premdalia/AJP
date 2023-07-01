import java.net.*;
import java.io.*;
import java.util.*;

public class tcpclient {

    public static void main(String []args)throws Exception{
            Socket s=new Socket("localhost",5000);
            System.out.println("Client is connected: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            while(true)
{
System.out.println("server: ");
    String str=br.readLine();
    System.out.println(str);
}
    }
    
    
}
