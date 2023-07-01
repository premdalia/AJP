import java.net.*;
import java.io.*;
import java.util.*;


public class add5SR {
    public static void main(String []args)throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("waiting: ");
        Socket s=ss.accept();
        System.out.println("connected2:");
      
         BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

         System.out.println("server: ");
    // String str=br.readLine();
    // int str2=Integer.parseInt(str);
    // System.out.println("client number is "+str2);

int str=Integer.parseInt(br.readLine());
System.out.println("client number is "+str);
int sum2=str+5;

String sum3=Integer.toString(sum2);
System.out.println("after convert to string: "+sum3);

    
        PrintWriter pw=new PrintWriter(s.getOutputStream());

        
       
            pw.println(sum3);
            pw.flush();
    }
}
