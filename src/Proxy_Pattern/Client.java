package Proxy_Pattern;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BBS s1,s2;
        //游客
        s1=new Proxy("张三",1);	//权限为1
        s1.function();

        //会员
        s2=new Proxy("李四",2);	//权限为2
        s2.function();
    }

}
