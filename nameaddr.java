import java.net.InetAddress;

public class nameaddr{
    public static void main(String []args)throws Exception{
            InetAddress Addr=InetAddress.getLocalHost();
            System.out.println("Local Address is : "+Addr.getHostAddress());
            String name=Addr.getHostName();
            System.out.println("name is:"+name);

    }

}