import java.util.*;
import java.net.*;

public class concatclient {
    public static void main(String args[])throws Exception{
        DatagramSocket ds=new DatagramSocket();
        System.out.println("connected");

        InetAddress ia=InetAddress.getLocalHost();
        String str = "";
        try (Scanner sc = new Scanner(System.in)) {
            while(!str.equals("exit")){
                System.out.println("Enter Strings: ");
                str=sc.nextLine();
                DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ia,5000);
                ds.send(dp);
            }
        }
    }
}