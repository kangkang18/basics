package generics;

public class Test {
    public static void main(String[] args) {
        MyArrary<String> list = new MyArrary<>();

        list.add("kk1");
        list.add("kk2");
        String list2 = list.get(1);
        System.out.println(list2);

    }
}
