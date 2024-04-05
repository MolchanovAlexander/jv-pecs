package core.mate.academy.service.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUM_OF_MACHINES = 3;
    private List<Bulldozer> machines = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        int randomPower = new Random().nextInt(100);
        for (int i = 0; i < randomPower; i++) {
            machines.add(new Bulldozer(randomPower));
        }
        return machines;
    }
}
