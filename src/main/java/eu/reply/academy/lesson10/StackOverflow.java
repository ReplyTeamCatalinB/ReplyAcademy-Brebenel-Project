package eu.reply.academy.lesson10;

public class StackOverflow {
    public static void main(String[] args) {

        System.out.println(stackOverFlowRecursive(1));
    }

    public static int stackOverFlowRecursive(int number) {

        int i = 1;
        if (number > i) {
            return 0;
        } else {
            return stackOverFlowRecursive(number -1) + stackOverFlowRecursive(number-2);
        }

    }

}
