package eu.reply.academy.lesson25.processors;

import java.util.ArrayList;
import java.util.List;

public class Processor {

    private List<Core> coreList = new ArrayList<>();

    public void addCore(Core core) {
        if (core == null) {
            return;
        }

        coreList.add(core);


    }
}
