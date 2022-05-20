package eu.reply.academy.lesson25.Main;

import eu.reply.academy.lesson25.processors.CoreDisk;
import eu.reply.academy.lesson25.processors.Processor;

public class Main {
    public static void main(String[] args) {

        CoreDisk coreDisk1 = new CoreDisk();
        Processor processor1 = new Processor();
        processor1.addCore(coreDisk1);
        Processor processor2 = new Processor();
        processor2.addCore(coreDisk1);
        Processor processor3 = new Processor();
        processor3.addCore(coreDisk1);

        Hypervisor hypervisor = new Hypervisor();
        hypervisor.addProcessor(processor1);
        hypervisor.addProcessor(processor2);
        hypervisor.addProcessor(processor3);
    }
}
