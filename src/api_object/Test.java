package api_object;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("kcy", 22);
        students[1] = new Student("csl", 22);
        students[2] = new Student("zwx", 23);
        students[3] = new Student("wj", 24);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age){
                    return 1;
                } else if (o1.age<o2.age) {
                    return -1;
                }else {
                    return 0;
                }

            }
        });
        System.out.println(Arrays.toString(students));

    }
}
