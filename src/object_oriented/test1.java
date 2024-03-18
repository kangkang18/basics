package object_oriented;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        String name = scanner.next();

        Student stu1 = new Student(name,score);

        System.out.println(stu1.getScore());
        System.out.println(stu1.getName());

        stu1.setScore(99);
        System.out.println(stu1.getScore());

        stu1.setName("kangkang");
        System.out.println(stu1.getName());

    }
}
