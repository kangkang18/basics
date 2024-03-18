package Polymorphism;

public abstract class  People {

    String name;
    int age;
    final public void nihao(){
        System.out.println("接下来有请"+ hello());
    }
    public abstract String hello();
    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void run(){
        System.out.println("跑步");
    }
}
