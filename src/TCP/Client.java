package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888);

        //创建一个独立的线程 负责随机从socket中接收服务器发送过来的信息
        new ClientReaderThread(socket).start();

        //从socket中得到字节输出流 和 字节输入流
        OutputStream outputStream = socket.getOutputStream();


        //把低级的字节输出流包装成数据输出流
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)){

                dataOutputStream.close();
                socket.close();
                break;
            }
            dataOutputStream.writeUTF(msg);
        }

//        //关闭外部的包装流  内部的自动也关闭了
//        dataOutputStream.close();
//        //释放连接资源
//        socket.close();



    }
}
