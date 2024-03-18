package File_IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class File_test1 {
    public static void main(String[] args) {
//        File f1 = new File("F:\\Language_study\\java\\basics\\basics\\test.txt");
//        System.out.println(f1.getName());
//        System.out.println(f1.length());
//
//        System.out.println(f1.exists());
//
//        long time = f1.lastModified();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        System.out.println(sdf.format(time));

        File f1 = new File("F:\\Language_study\\java");
        searchFile(f1,"test.txt");


    }
    public static void searchFile(File dir, String fileName){
//  1.把非法情况都拦截
        if(dir == null || !dir.exists() || dir.isFile()){
            return;
        }

        //2. dir不是null，存在，一定是目录对象
        //获取当前目录下的全部一级文件对象。
        File[] files = dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if(files != null && files.length > 0){
            //4.遍历全部一级文件对象
            for (File file : files) {
                //5.判断文件是否是文件，还是文件夹
                if(file.isFile()){
                    //是文件，判断这个文件名是否是我们要找的
                    if (file.getName().contains(fileName)){
                        System.out.println("找到了："+file.getAbsolutePath());
                    }

                }else{
                    //是文件夹，继续重复这个过程(递归)
                    searchFile(file,fileName);
                }
            }
        }
    }

}
