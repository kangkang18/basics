package Adapter;

// 定义机器人接口
interface Robot {
    void cry();
    void move();
}

// 定义动物接口
interface Animal {
    void bark();
    void run();
}

// 定义狗类
class Dog implements Animal {
    public void bark() {
        System.out.println("狗叫：汪汪汪！");
    }

    public void run() {
        System.out.println("狗跑：快速移动！");
    }
}

// 定义适配器类
class DogAdapter implements Robot {
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    public void cry() {
        dog.bark();
    }

    public void move() {
        dog.run();
    }
}

// 测试代码
public class Test {
    public static void main(String[] args) {
        // 创建狗对象
        Dog dog = new Dog();

        // 创建适配器对象
        Robot robot = new DogAdapter(dog);

        // 调用适配器方法，实现机器人像狗一样叫和跑
        robot.cry();
        robot.move();
    }
}
