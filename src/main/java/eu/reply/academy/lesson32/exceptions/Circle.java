package eu.reply.academy.lesson32.exceptions;

public class Circle {

    int raza;

    public void setRaza(int raza) {
        if (raza < 1) {
            throw new NumberFormatException("Cannot be less then 1! " + raza);
        }

        this.raza = raza;
    }
}
