package string;

import java.util.Random;
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println(code);
        System.out.println("请输入验证码");
        Scanner scanner = new Scanner(System.in);
        String code1 = scanner.next();
        if(code.equalsIgnoreCase(code1))
        {
            System.out.println("验证成功");
        }
        else {
            System.out.println("验证失败");
        }
    }

    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);

        }
        return  code;
    }

}
