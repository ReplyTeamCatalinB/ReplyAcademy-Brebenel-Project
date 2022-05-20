package eu.reply.academy.lesson21.beans;

import java.io.BufferedReader;
import java.io.Serializable;

public class Oras {
    private int id;
    private double x;
    private double y;
    private String nume;
    private String judet;
    private String judetAuto;
    private int idUat;
    private long populatie;
    private String regiune;

    //primeste aray string si care incarca mebrii pe baza arayului


    public Oras(String[] aux) {
        this.x = Double.parseDouble(aux[0]);
        this.y = Double.parseDouble(aux[1]);
        this.nume = aux[2];
        this.judet = aux[3];
        this.judetAuto = aux[4];
//        try {
        this.populatie = Long.parseLong(aux[5]);
//        }catch (NumberFormatException numberFormatException){
//            numberFormatException.getMessage();
//        }
        this.regiune = aux[6];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getJudetAuto() {
        return judetAuto;
    }

    public void setJudetAuto(String judetAuto) {
        this.judetAuto = judetAuto;
    }

    public int getIdUat() {
        return idUat;
    }

    public void setIdUat(int idUat) {
        this.idUat = idUat;
    }

    public long getPopulatie() {

        return populatie;
    }

    public void setPopulatie(long populatie) {

       this.populatie = populatie;


    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    @Override
    public String toString() {
        return "Population: " + populatie;
    }
}
