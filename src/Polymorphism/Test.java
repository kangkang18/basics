package Polymorphism;

public class Test {
    public static void main(String[] args) {
        People a = new Student();
        People b = new Teacher();

        a.nihao();
        b.nihao();
    }
}
