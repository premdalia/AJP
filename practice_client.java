import java.util.*;
import java.net.*;

public class practice_client {
    public static void main(String args[])throws Exception{
        DatagramSocket ds=new DatagramSocket();
        System.out.println("connected");
        InetAddress ia=InetAddress.getLocalHost();
        String str="";
        String str2="";
        Scanner sc=new Scanner(System.in);





        while(true){
            System.out.print("C: ");
            str=sc.nextLine();
            DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ia,5000);
             ds.send(dp);

             //over
             System.out.print("S: ");
                byte[] b = new byte[1024];
                DatagramPacket dp1 = new DatagramPacket(b, b.length);
                ds.receive(dp1);
                str2 = new String(dp1.getData(),0,dp1.getLength()); 
                System.out.println(str2);
             
            }

    }}