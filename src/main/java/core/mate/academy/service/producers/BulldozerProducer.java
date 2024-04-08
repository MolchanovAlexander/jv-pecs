package core.mate.academy.service.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUM_OF_MACHINES = 3;
    private static final int MAX_POWER = 300;
    private static final int MIN_POWER = 100;
    private final Random random = new Random();

    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        int randomPower = random.nextInt(MIN_POWER, MAX_POWER);
        for (int i = 0; i < NUM_OF_MACHINES; i++) {
            machines.add(new Bulldozer(randomPower));
        }
        return List.copyOf(machines);
    }
}
