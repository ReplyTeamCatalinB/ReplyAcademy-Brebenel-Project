package eu.reply.academy.lesson33;

public class Main {
    public static void main(String[] args) {
        Parent kid = new Child();
        kid.saySomething();
        kid.setAge(10);
        kid.setName("Ana");
        kid.getAge();
        kid.getName();

        System.out.println(kid);


        Child kid2 = new Child();
        kid2.saySomething();
        kid2.setAge(12);
        kid2.setName("Maria");
        kid2.getAge();
        kid2.getName();
        System.out.println(kid2);
    }
}
