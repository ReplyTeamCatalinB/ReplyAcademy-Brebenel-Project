package eu.reply.academy.lesson25.Main;

import eu.reply.academy.lesson25.processors.Processor;
import eu.reply.academy.lesson25.tools.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hypervisor {


    private static final String VM_NAME = "name";
    private static final String VM_TYPE = "type";
    private static final String VM_NOPROCESSORS = "noOfProcessors";

    List<Processor> processors = new ArrayList<>();

    public void addProcessor(Processor processor) {
        if (processor == null) {
            return;
        }
        processors.add(processor);

    }

    public void createVirtualMachine(String path, String fileName, int priority) {
        VirtualMachine vm = new VirtualMachine();

        String line;
        String key;
        try (BufferedReader br = new BufferedReader(new FileReader(path + fileName))) {
            while ((line = br.readLine()) != null) {

                key = StringUtils.getKey(line);
                if (VM_NAME.equals(key)) {
                    vm.setNameOfOperatingSystem(StringUtils.getValue(line));

                }

                if (VM_TYPE.equals(key)) {
                    vm.setTypeOfOperatingSystem(StringUtils.getValue(line));

                }

                if (VM_NOPROCESSORS.equals(key)) {
                    vm.setNumberOfVirtualProcessors(StringUtils.getValue(line));
                }

                if (key.startsWith("app")) {
                    vm.addApp(StringUtils.getValue(line));
                }
            }
        } catch (IOException e) {

        }
    }

    public void addApplication(VirtualMachine vm, String app) {
        vm.addApp(app);
    }

}
