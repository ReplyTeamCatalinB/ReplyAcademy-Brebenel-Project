package eu.reply.academy.lesson10;

public class Staircase {

    //Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.
    //
    //To illustrate, if n = 4 there are 5 ways to climb:
    //
    //[1, 1, 1, 1]
    //[2, 1, 1]
    //[1, 2, 1]
    //[1, 1, 2]
    //[2, 2]
    //Examples
    //waysToClimb(1) ➞ 1
    //
    //waysToClimb(2) ➞ 2
    //
    //waysToClimb(5) ➞ 8
    //Notes
    //A staircase of height 0 should return 1.
    public static void main(String[] args) {

        System.out.println((4));
    }

    public static int stairs(int n) {

        if(n == 0) {
            return 0;
        }else if (n==1){
            return 1;
        } else return stairs(n-1) + stairs(n-2);
    }

}
