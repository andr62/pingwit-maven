package pingwit.maven.lec_10.hm.task_3;

public class Garage<T extends Car> {
    private Car car;

    public void attributeCarToGarage(T car) {
        this.car = car;
    }
}



