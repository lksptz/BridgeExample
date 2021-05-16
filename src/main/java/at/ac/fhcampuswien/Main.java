package at.ac.fhcampuswien;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bus(new Produce(), new Assemble());
        Vehicle v2 = new Bike(new Produce(), new Assemble());
        v1.manufacture();
        v2.manufacture();
    }
}
