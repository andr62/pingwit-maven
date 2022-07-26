package pingwit.lec_5.hm.task_1;


public class PC implements Computer {

    @Override
    public void turnOn() {
        System.out.println("The PC is on");
    }

    @Override
    public void turnOff() {
        System.out.println("The PC is off");

    }

    @Override
    public void reset() {
        System.out.println("The PC is being reset");
    }

    @Override
    public boolean isConnectedToElectricity() {
        System.out.println("Hello from PC class");
        return true;
    }
}
