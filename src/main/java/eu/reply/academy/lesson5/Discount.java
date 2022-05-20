package eu.reply.academy.lesson5;

public class Discount {
    public static void main(String[] args) {

        Discount discount = new Discount();
        System.out.println(discount.priceAfterDiscount(100,25));

    }

    public float priceAfterDiscount(int price, int discount) {

        return (price * discount) / 100;
    }
}
