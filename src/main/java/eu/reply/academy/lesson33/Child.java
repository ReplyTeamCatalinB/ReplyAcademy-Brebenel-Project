package eu.reply.academy.lesson33;

public class Child extends Parent {

    private int age;
    private String name;

    public  void saySomething() {
        System.out.println("Child");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
