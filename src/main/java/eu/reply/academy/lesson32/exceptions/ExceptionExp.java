package eu.reply.academy.lesson32.exceptions;

public class ExceptionExp {

    public static void main(String[] args) {
        String number = null;

        for (int i = 0; i < 10; i++) {

            try {
                number.indexOf("yes");
                Integer.parseInt(number);
            } catch (NullPointerException ex) {
                System.out.println("main : EX03 : " + i + "something is null" + ex);
            }catch (NumberFormatException ex) {
                System.out.println("main : EX02 : " + i + " parse failed" + number);
            }catch (Exception ex) {
                System.out.println("main : EX01 : " + i + " Come on!WTF" + ex);
            }
        }
        System.out.println("yes");
        Circle circle = new Circle();
        try {
            circle.setRaza(-1);
        }catch (NumberFormatException exception) {
            exception.printStackTrace();
        }
        System.out.println("yes");

    }
}
