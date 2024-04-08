package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int year;

    public Excavator() {
    }

    public Excavator(int year) {
        this.year = year;
    }

    public int getPower() {
        return year;
    }

    public void setPower(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
