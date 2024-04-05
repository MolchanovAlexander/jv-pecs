package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUM_OF_MACHINES = 3;
    private List<Excavator> machines = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        int randomPower = new Random().nextInt(100);
        for (int i = 0; i < randomPower; i++) {
            machines.add(new Excavator(randomPower));
        }
        return machines;
    }
}
