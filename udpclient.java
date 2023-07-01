import java.io.*;
import java.util.*;
import java.net.*;

public class udpclient {
    public static void main(String args[])throws Exception{
        DatagramSocket ds=new DatagramSocket();

        int i=7;
        System.out.println(i);
        byte[] b=String.valueOf(i).getBytes();
        InetAddress ia=InetAddress.getLocalHost();
       

        DatagramPacket dp=new DatagramPacket(b, b.length, ia, 5000);
        ds.send(dp);/////over....

        byte[] b1=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(b1,b1.length);
        ds.receive(dp1);


        String str=new String(dp1.getData());
        System.out.println("result is: "+str);

    }
}
