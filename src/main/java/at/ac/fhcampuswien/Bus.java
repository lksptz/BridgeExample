package at.ac.fhcampuswien;

public class Bus extends Vehicle {

    public Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bus");
        workshop1.work();
        workshop2.work();
    }
}
