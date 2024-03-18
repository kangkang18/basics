package File_IO;

import java.io.*;

public class IO_test {
    public static void main(String[] args) throws Exception {
        //InputStream is = new FileInputStream(("F:\\Language_study\\java\\basics\\basics\\test.txt"));

//        System.out.println(is.read());
//        System.out.println(is.read());
//        System.out.println(is.read());

        //每次读取多个字节
//        byte[] buffer = new byte[3];
//
//        System.out.println(is.read(buffer));
//        String rs = new String(buffer,0, buffer.length );
//        System.out.println(rs);
//        for (byte b : buffer) {
//            System.out.println(b);
//        }
//        is.close();

        OutputStream os = null;
        try {
            os =  new FileOutputStream("F:\\Language_study\\java\\basics\\basics\\test2.txt",true);

        os.write(97);
        os.write('b');

            byte[] bytes = "kk and  coco  ".getBytes();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
       os.close();

       //123
        }

    }
}
