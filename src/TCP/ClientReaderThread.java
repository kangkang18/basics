package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is =  socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);


                } catch (IOException e) {
                    System.out.println("自己下线了： "+socket.getRemoteSocketAddress());
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
}
