package eu.reply.academy.lesson6;

public class IncreasingDecreasingNumbers {
    /*
    [1:37 PM] Emanuel Neculai
n = 2
incDec(2) -> sa intoarca cate numere sunt increasing sau decreaasing pana la 1000
n=2 -> 9 inclusiv (<10) -> maxim de cifre = 1
n=3 -> 99 inclusiv(<100) -> maxim de cifre =2
numar de cifre maxim este n-1
1,2,3,4,5,6,7,8,9,10,11,12,13,14,20,21,22,23,24,25,....,78,99
100 -> decreasing
101 -> Nu e
102 -> Nu e
103 -> Nu e
....
110 -> Decreasing
111 -> Increasing/Decreasing
112 -> Increasing
....
120 -> nu e
121 -> Nu e
122 -> Increasing
....
129 -> Increasing
130 -> Nu e
131 -> Nu e
...
133 -> Increasing
....
139 -> Increasing
140 -> Nu e
....
144 -> Increasing
----
149 -> Increasing
150 -> Nu e
----
155 -> Increasing
........
1..
11. 111 112 113 .... 119
12. 122 123 124 .... 129
13. 133 134 135..... 139
14.
15.
16.
17.
18. 188 189
19.
2..
22. 222 223 224
23. 233 234 235
..
29. 299
8..
88. 888 889
89. 899
...
9..
999


     */

    public static void main(String[] args) {
        IncreasingDecreasingNumbers increasing = new IncreasingDecreasingNumbers();
        int n = 3;
        increasing.increasingNumbers(0, " ", n);
//        increasing.decreasingNumbers(0, " ",n);

    }

    public void increasingNumbers(int start, String out, int n) {
        if (n == 0) {
            System.out.println(out + " ");
            return;
        }

        for (int i = start; i <= 9; i++) {
            String str = out + Integer.toString(i);
            increasingNumbers(i , str, n - 1);
        }
    }

    public void decreasingNumbers(int start, String out, int n) {
        if (n == 0) {
            System.out.println(out + " ");
            return;
        }

        for (int i = 9; i >= start; i--) {
            String str = out + Integer.toString(i);
            decreasingNumbers(i + 1, str, n - 1);
        }

    }
}
   /*
    public static void main(String[] args) {

    }

    public static boolean checkIncOrDecNumber(int n) {
        int aux = n;
        int currentDigit = aux % 10;
        String currentMode = "";
        String previousMode = "";
        while (aux / 10 > 0 && currentMode.equals(previousMode)) {
            previousMode = currentMode;
            aux = aux / 10;
            if (currentDigit < aux % 10) {
                currentMode = "decreasing";
            } else if (currentDigit > aux % 10) {
                currentMode = "increasing";
            }
            currentDigit = aux % 10;
            if (previousMode.equals("")) {
                previousMode = currentMode;
            }
        }
        return currentMode.equals(previousMode);
    }

    public static int countIncDec(int n) {
        int count = 0;
        for (int i = 0; i < Math.pow(10, n); i++) {
            if (checkIncOrDecNumber(i)) {
                count++;
                //System.out.println(i);
            }
        }
        return count;
    }
     */





