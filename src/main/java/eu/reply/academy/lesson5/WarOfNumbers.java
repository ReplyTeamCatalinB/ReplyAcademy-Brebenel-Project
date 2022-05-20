package eu.reply.academy.lesson5;

public class WarOfNumbers {

    public static void main(String[] args) {
        WarOfNumbers war = new WarOfNumbers();
        int[] arr =new int[] {1,2,3,3,5,6,7,8,261,231};
        try {
            System.out.println(war.resolveTheWar(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int resolveTheWar(int[] parameter) throws Exception{

        int odd =  0, even = 0, sub = 0;
        for (int i = 0; i < parameter.length; i++) {

            if(parameter[i] % 2 == 0) {
                even +=parameter[i];
            }else {
                odd +=parameter[i];
            }
        }

        sub = Math.abs(even-odd);
        System.out.println(sub);

        return sub;
    }
}
