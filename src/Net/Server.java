package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        //创建服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        while (true) {
            //创建一个数据包对象，接收数据
            byte[] bytes = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

            socket.receive(packet);
            int len = packet.getLength();
            String s = new String(bytes, 0, len);
            System.out.println(s);
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());


          //  socket.close();
        }


    }
}
