package eu.reply.academy.lesson26.shape;

public class Patrat extends Dreptunghi{

    public Patrat(double lungime) {
        super(lungime,lungime);
    }


    public double getArea() {
        return getLungime() * getLungime();
    }
}
