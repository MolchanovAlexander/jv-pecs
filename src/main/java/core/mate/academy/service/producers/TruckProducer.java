package core.mate.academy.service.producers;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUM_OF_MACHINES = 3;
    private final Random random = new Random();

    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        boolean randomTrail = random.nextBoolean();
        for (int i = 0; i < NUM_OF_MACHINES; i++) {
            machines.add(new Truck(randomTrail));
        }
        return List.copyOf(machines);
    }
}
