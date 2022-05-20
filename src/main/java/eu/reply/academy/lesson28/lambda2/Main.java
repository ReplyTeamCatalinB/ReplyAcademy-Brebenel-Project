package eu.reply.academy.lesson28.lambda2;

public class Main {
    public static void main(String[] args) {
        Substring<Integer,String,String> obiect = (a,b)->b.substring(0,a);
        System.out.println(obiect.printSubstring(1,"ana"));
    }
}
