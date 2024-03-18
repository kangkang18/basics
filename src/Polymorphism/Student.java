package Polymorphism;

public class Student extends People{
    @Override
    public void run(){
       System.out.println("学生跑步");
   }
    @Override
    public String hello(){
        return "学生";
    }

}
