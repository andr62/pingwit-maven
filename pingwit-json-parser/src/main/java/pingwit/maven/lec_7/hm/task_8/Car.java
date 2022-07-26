package pingwit.lec_7.hm.task_8;

public class Car {
    private static String manufacturer;
    private static Double engineVolume;

    private Car() {
        this("MAN", 5.0);
    }

    Car(String manufacturer, Double engineVolume) {
        Car.manufacturer = manufacturer;
        Car.engineVolume = engineVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String setManufacturer() {
        return manufacturer;
    }

    public void setEngineVolume(double v) {
    }

    public void show() {
        System.out.println(manufacturer + " " + engineVolume);
    }

}
