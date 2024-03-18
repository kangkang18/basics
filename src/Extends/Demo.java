package Extends;

public class Demo {
    public static void main(String[] args) {
        Teacher a = new Teacher("kangkang", 23, "qq");
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getSkill());
    }
}
    class People {
        private String name;
        private int age;

        public People() {
        }

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    class Teacher extends People {
        String skill;

        public Teacher(String name, int age, String skill) {
            super(name, age);
            this.skill = skill;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }
    }


