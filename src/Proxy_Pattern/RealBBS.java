package Proxy_Pattern;

public class RealBBS implements BBS {

    @Override
    public void function() {
        // TODO Auto-generated method stub

        System.err.println("您可以有以下权限：");
        System.err.println("看帖、发帖、修改自己的帖子");
    }

}

