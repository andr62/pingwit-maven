package pingwit.lec_5.hm.task_1;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new PC();
        computer.turnOn();
        computer.turnOff();
        computer.reset();
        if (computer.isConnectedToElectricity()) {
            System.out.println("You can turn on the computer");
        }
    }
}