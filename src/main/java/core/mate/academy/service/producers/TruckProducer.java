package core.mate.academy.service.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUM_OF_MACHINES = 3;
    private List<Truck> machines = new ArrayList<>();

    @Override
    public List<Truck> get() {
        int randomPower = new Random().nextInt(100);
        for (int i = 0; i < randomPower; i++) {
            machines.add(new Truck(randomPower));
        }
        return machines;
    }
}
