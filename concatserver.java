import java.net.*;

public class concatserver {
    public static void main(String args[]) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        System.out.println("connected");
        String concat = "";
        String str = "";
        while (true) {
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            str = new String(dp.getData(),0,dp.getLength());      
            if (!str.equals("exit")) {
                concat += str;
            } else {
                break;
            }
        }
        System.out.println(concat);
        ds.close();
    }
}