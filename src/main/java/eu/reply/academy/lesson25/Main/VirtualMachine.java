package eu.reply.academy.lesson25.Main;

import java.util.ArrayList;
import java.util.List;

public class VirtualMachine {

    private String nameOfOperatingSystem;
    private String typeOfOperatingSystem;
    private int numberOfVirtualProcessors;


    List<String> apps;

    public VirtualMachine() {

    }

    public VirtualMachine(VirtualMachine vm) {
        setNameOfOperatingSystem(vm.getNameOfOperatingSystem());
        setTypeOfOperatingSystem(vm.getTypeOfOperatingSystem());
        setNumberOfVirtualProcessors(vm.getNumberOfVirtualProcessors());
        cloneApps(vm.getApps());
    }

    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    public void cloneApps(List<String> apps) {
        this.apps = new ArrayList<>();
        for (String app : apps) {
            this.apps.add(app);
        }
    }

    public void addApp(String app) {
        if (app == null) {
            return;
        }
        apps.add(app);
    }

    public String getNameOfOperatingSystem() {
        return nameOfOperatingSystem;
    }

    public void setNameOfOperatingSystem(String nameOfOperatingSystem) {
        this.nameOfOperatingSystem = nameOfOperatingSystem;
    }

    public String getTypeOfOperatingSystem() {
        return typeOfOperatingSystem;
    }

    public void setTypeOfOperatingSystem(String typeOfOperatingSystem) {
        this.typeOfOperatingSystem = typeOfOperatingSystem;
    }

    public int getNumberOfVirtualProcessors() {
        return numberOfVirtualProcessors;
    }

    public void setNumberOfVirtualProcessors(String numberOfVirtualProcessors) {
        if (numberOfVirtualProcessors == null) {
            return;
        }
        this.numberOfVirtualProcessors = Integer.parseInt(numberOfVirtualProcessors);
    }

    public void setNumberOfVirtualProcessors(int numberOfVirtualProcessors) {
        this.numberOfVirtualProcessors = numberOfVirtualProcessors;
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "nameOfOperatingSystem='" + nameOfOperatingSystem + '\'' +
                ", typeOfOperatingSystem='" + typeOfOperatingSystem + '\'' +
                ", numberOfVirtualProcessors=" + numberOfVirtualProcessors +
                '}';
    }
}

