import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.IOException;

public class fiboCL {

    public static void main(String args[]) throws IOException{
        Socket s=new Socket("localhost",5000);

        System.out.println("Connection established:..");


        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(s.getInputStream());
        PrintWriter pw=new PrintWriter(s.getOutputStream());


        System.out.println("Enter number is: ");

        String data=sc.nextLine();
        pw.println(data);
        pw.flush();//sending part over..


        while(true){


            
            int got=sc1.nextInt();
            System.out.println(got);
        }



        
    }
    }
