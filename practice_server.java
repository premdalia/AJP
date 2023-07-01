import java.net.*;
import java.util.Scanner;

public class practice_server {
    public static void main(String args[]) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        System.out.println("connected");
        String str="";
        String str2="";
         Scanner sc=new Scanner(System.in);   
          InetAddress ia=InetAddress.getLocalHost();             


            while(true){
                System.out.print("C: ");
                byte[] b = new byte[1024];
                DatagramPacket dp = new DatagramPacket(b, b.length);
                ds.receive(dp);
                str = new String(dp.getData(),0,dp.getLength()); 
                System.out.println(str);



            System.out.print("S: ");
            str2=sc.nextLine();
            DatagramPacket dp1=new DatagramPacket(str2.getBytes(),str2.length(),ia,5000);
             ds.send(dp1);
            }

            //over...

    }}