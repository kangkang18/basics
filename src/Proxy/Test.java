package Proxy;

public class Test {
    public static void main(String[] args) {
        BigStar s = new BigStar("coco");
        Star starProxy = ProxyUtil.createProxy(s);

        String rs = starProxy.sing("hao ri zi");
        System.out.println(rs);

    }
}
