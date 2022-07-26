package pingwit.lec_5.hm.task_1;

public interface Computer {
    void turnOn();

    void turnOff();

    void reset();

    default boolean isConnectedToElectricity() {
        System.out.println("Hello from computer interface");
        return true;
    }
}
