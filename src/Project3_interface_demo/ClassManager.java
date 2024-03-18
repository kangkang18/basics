package Project3_interface_demo;

import java.util.ArrayList;

public class ClassManager {

    private ArrayList<Student> students = new ArrayList<>();
     //ArrayList<Student> students = new ArrayList<>();

    private StudentOperator studentOperator = new StudentOperatorImpl2();
    public ClassManager(){
        Student s1 = new Student("kk",'男',98);
        students.add(new Student("zwx",'男',99));
        students.add(new Student("wj",'男',100));
        students.add(new Student("zwj",'女',98));
        students.add(new Student("csl",'男',98));
        students.add(new Student("mmy",'男',98));
    }

    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    public void printScore(){
        studentOperator.printAverageScore(students);

    }
}
