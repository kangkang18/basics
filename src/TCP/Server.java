package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    //定义一个集合存储 在线的客户端
    public static List<Socket> onLineSocket = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动成功");
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = null;

        while (true) {
            //使用serverSocket对象，调用一个accept方法，等待客户端的请求
            accept = serverSocket.accept();


            onLineSocket.add(accept);

            System.out.println("有人上线了"+accept.getRemoteSocketAddress());

            //把这个客户端对应的socket通信管道，交给一个独立的线程负责处理

            new ServerReaderThread(accept).start();
        }

        //从socket通信管道中得到一个字节输入流
//
//        InputStream inputStream = accept.getInputStream();
//
//        //把原始的字节输入流包装成数据输入流
//        DataInputStream dataInputStream = new DataInputStream(inputStream);
//
//        while (true) {
//            try {
//                String rs = dataInputStream.readUTF();
//                System.out.println(rs);
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//                System.out.println(accept.getRemoteSocketAddress()+"离线了");
//                accept.close();
//                inputStream.close();
//                break;
//            }
//
//            //也可以获取客户端的IP地址
//           // System.out.println(accept.getRemoteSocketAddress());
//        }

       // accept.close();
      //  inputStream.close();
    }
}
