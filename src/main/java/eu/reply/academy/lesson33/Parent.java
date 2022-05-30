package eu.reply.academy.lesson33;

public class Parent extends Abstract implements Interface {

    private int age;
    private String name;

    static int age2;

    public void saySomething() {
        System.out.println("Parent");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
