package hw6;

public class Car {
    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Engine is started");
    }

    private void startElectricity() {
        System.out.println("Start electricity");
    }

    private void startCommand() {
        System.out.println("Start Command");
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system");
    }
} 
