import java.net.*;
import java.io.*;
import java.util.*;

public class loopclient {

    public static void main(String []args)throws Exception{
            Socket s=new Socket("localhost",5000);
            System.out.println("Client is connected: ");
            
            Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(s.getOutputStream());

        System.out.println("Enter number is: ");
         String data=sc.nextLine();
            pw.println(data);
            pw.flush();

            for (int i = 1; i <= 5; i++){


                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                
                String str=br.readLine();
                int str2=Integer.parseInt(str);
                System.out.println("server respond:  "+str2);
            }
    }
    
    
}
