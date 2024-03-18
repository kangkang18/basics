package Proxy_Pattern;


public class Proxy implements BBS {
    private RealBBS bbs=new RealBBS();//维持一个对对真实主题对象的引用
    private int permission=2;	//权限
    private String name;

    public Proxy(String name,int permission) {
        this.name=name;
        this.permission=permission;
    }


    @Override
    public void function() {
        // TODO Auto-generated method stub
        if(permission>=2) {
            System.err.println("-----------------");
            System.err.println("尊敬的bbs会员："+this.name);
            bbs.function();
        }
        else {
            System.err.println("-----------------");
            System.err.println("亲，"+this.name+",你只是个游客，你只能看帖哦！");
        }
    }

}

