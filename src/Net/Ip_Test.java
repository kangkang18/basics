package Net;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip_Test {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = Inet4Address.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());

        boolean reachable = byName.isReachable(6000);
        System.out.println(reachable);

    }
}
