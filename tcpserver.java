import java.net.*;
import java.io.*;
import java.util.*;


public class tcpserver {
    public static void main(String []args)throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("waiting: ");
        Socket s=ss.accept();
        System.out.println("connected2:");
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(s.getOutputStream());
        while(true) {
            System.out.println("You r writing: ");
            String data=sc.nextLine();   //server par j lakhva ma help kar 
            pw.println(data);   //aa data outstream sudhi lai jaay printwriter par muke
            pw.flush();


        }
        
    }
}
