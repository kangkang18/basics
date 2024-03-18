package Inner_class;

public class Outer {
    private String name;

    private int age = 99;

    class inner{
        private  int age = 88;
        void test(){
            int age = 77;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);

        }
    }
public static class inner1{
        void test(){
            System.out.println("我是静态内部类");
    }
}


}
