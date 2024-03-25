package Net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();


        //创建数据包对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String sc = scanner.nextLine();


            //输入exit推出
            if ("exit".equals(sc)){
                System.out.println("退出成功");
                socket.close();
                break;
            }
            byte[] bytes = sc.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);


            //开始发送数据
            socket.send(packet);
        }

//        System.out.println("客户端数据发送完毕");
//        socket.close();
    }
}
