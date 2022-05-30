package eu.reply.academy.lesson32.pluralSClasses;

import java.util.List;

public class Customer {
    private int x;
    private String name;
    private List<String> interest;
    private Address address;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Customer() {

    }

    public Customer(String name, List<String> interest,Address address) {
        this.name = name;
        this.interest = interest;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }
}
