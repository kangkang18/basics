package Project3_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImp1 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("----------------全班的信息如下--------------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名  :" + s.getName());
            System.out.println("性别  :" + s.getSex());
            System.out.println("分数  :" + s.getScore());

        }
        System.out.println("---------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
    double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("平均分是:" + (allScore) / students.size());
    }
}
