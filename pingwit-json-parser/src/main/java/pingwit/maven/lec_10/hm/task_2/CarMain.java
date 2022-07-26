package pingwit.lec_10.hm.task_2;

public class CarMain {
    public static void main(String[] args) {
        Truck Volvo = new Truck();
        CarConstructor carConstructor = new CarConstructor(Volvo);
        System.out.println(carConstructor);

        Roadster Tesla = new Roadster();
        CarConstructor teslaCarConstructor = new CarConstructor(Tesla);
        System.out.println(teslaCarConstructor);


    }
}
