package Inner_class;

public class Test {
    public static void main(String[] args) {
        Outer.inner in = new Outer().new inner();
        in.test();

        Outer.inner1 in1 = new Outer.inner1();
        in1.test();
    }
}


