import java.net.*;
import java.util.*;
import java.io.*;

public class palindserver {
     public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("waiting..");
        Socket s=ss.accept();
        System.out.println("connected");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("print str: "+str);
        String str2="";

        // char d='a';
        // String e=str+" "+d;
        // System.out.println(e);

        PrintWriter pw=new PrintWriter(s.getOutputStream());
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            str2=str2+c;

        }
        System.out.println(str2);

         if(str.equalsIgnoreCase(str2)){
                System.out.println("palindrome");
                pw.println("palindrome");
                pw.flush();
            }else{
            System.out.println("not palindrome");
                pw.println("not palindrome");
                pw.flush();
        }

       
}}