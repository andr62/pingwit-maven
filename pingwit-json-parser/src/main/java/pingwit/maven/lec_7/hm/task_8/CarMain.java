package pingwit.lec_7.hm.task_8;

public class CarMain {
    public static void main(String[] args) {

        Car teslaCar = new Car("Tesla", 1.4);
        Car bmwCar = new Car("BMW", 1.4);
        Car mercedesCar = new Car("Mercedes", 1.8);
        Car audiCar = new Car("AUDI", 1.8);

        Car[] cars = new Car[4];
        cars[0] = teslaCar;
        cars[1] = bmwCar;
        cars[2] = mercedesCar;
        cars[3] = audiCar;

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.getEngineVolume() == 1.4) {
                car.setEngineVolume(2.0);
            }
            //  teslaCar.show();
            // audiCar.show();
            // bmwCar.show();
            mercedesCar.show();

        }
    }
}
