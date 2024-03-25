package TCP;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread{

    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            InputStream is =  socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    
                    //把信息分发给所有的客服端
                    sendMsgToAll(msg);
                } catch (IOException e) {
                    System.out.println("有人下线了： "+socket.getRemoteSocketAddress());
                    //下线了  直接从在线集合中除去
                    Server.onLineSocket.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void sendMsgToAll(String msg) throws Exception {
        //发送给全部在线的socket管道接收
        for (Socket socket1 : Server.onLineSocket) {
            OutputStream outputStream = socket1.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF(msg);


        }
    }

}
