package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUM_OF_MACHINES = 3;
    private static final int MAX_YEAR = 2024;
    private static final int MIN_YEAR = 1970;
    private final Random random = new Random();

    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        int randomYear = random.nextInt(MIN_YEAR, MAX_YEAR);
        for (int i = 0; i < NUM_OF_MACHINES; i++) {
            machines.add(new Excavator(randomYear));
        }
        return List.copyOf(machines);
    }
}
