package pingwit.maven.lec_10.hm.task_2;

public class CarConstructor {
    private String car;

    public <T extends CarType> CarConstructor(T car) {
        this.car = car.getCarType();
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String toString() {
        return "CarConstructor{" +
                "car type='" + car + '\'' +
                '}';
    }
}
