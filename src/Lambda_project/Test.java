package Lambda_project;

import api_object.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("swim");
//            }
//        };
//        s.swim();
//    }

//        Swimming s = () -> {
//            System.out.println("swim");
//        };
//        s.swim();
        Student[] students = new Student[4];
        students[0] = new Student("kcy", 22);
        students[1] = new Student("csl", 22);
        students[2] = new Student("zwx", 23);
        students[3] = new Student("wj", 24);
        //原始写法
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//
//            }
//        });
        //Lambda简化后的形式
       // Arrays.sort(students, (o1,o2)-> o1.getAge()- o2.getAge());
       //Arrays.sort(students, (o1,o2)-> Compare.CompareByAge(o1,o2));
       //Arrays.sort(students, Compare::CompareByAge);
//       Compare compare = new Compare();
//       Arrays.sort(students,compare::CompareByAgenew);
//        System.out.println(Arrays.toString(students));
        String [] names = {"kcy","csl","zwx","wj"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });


        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}

interface Swimming {
    void swim();
}

abstract class Animal {
    public abstract void run();
}