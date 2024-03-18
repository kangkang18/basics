package Polymorphism;

public class Teacher extends People{
    @Override
    public void run(){
        System.out.println("老师跑步");
    }

    @Override
    public String hello(){
        return "老师";
    }
}
