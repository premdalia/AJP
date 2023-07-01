import java.io.*;
import java.net.*;
import java.util.*;


public class udpserver {

    public static void main(String args[])throws Exception{


        DatagramSocket ds=new DatagramSocket(5000);
        byte[] b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,b.length);
        ds.receive(dp);
        String str=new String(dp.getData());

        System.out.println("client data is: "+str);
        int num=Integer.parseInt(str.trim());

        
        int sum=num*2;
        System.out.println(sum);

        byte[] b1=String.valueOf(sum).getBytes();
        InetAddress ia=InetAddress.getLocalHost();
        
        DatagramPacket dp1=new DatagramPacket(b1,b1.length,ia,dp.getPort());

        ds.send(dp1);





    }
    
}
