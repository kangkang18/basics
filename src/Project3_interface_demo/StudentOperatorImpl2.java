package Project3_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("----------------全班的信息如下--------------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
            System.out.println("姓名  :" + s.getName());
            System.out.println("性别  :" + s.getSex());
            System.out.println("分数  :" + s.getScore());

        }
        System.out.println("男生有:" + count1 + ";  女生有:" + count2);
        System.out.println("---------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {


            Student s = students.get(i);
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
            allScore += s.getScore();
        }
        allScore = allScore-min-max;
        System.out.println("平均分是:" + (allScore) /( students.size()-2));
    }
}
