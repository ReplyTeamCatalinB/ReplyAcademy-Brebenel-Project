package eu.reply.academy.lesson25.processors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CoreScreen extends Core{

    private int id;

    @Override
    public void action() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CoreScreen{" +
                "id=" + id +
                '}';
    }
}
