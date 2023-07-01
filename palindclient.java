import java.net.*;
import java.util.*;
import java.io.*;




public class palindclient {

    public static void main(String args[])throws Exception{

        Socket s=new Socket("localhost",5000);
        Scanner sc=new Scanner(System.in);
        System.out.println("established..");
        System.out.println("enter string..");
        PrintWriter pw=new PrintWriter(s.getOutputStream());
        String data=sc.nextLine();
        pw.println(data);
        pw.flush();


         BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("print str: "+str);



        


    }
    
}
