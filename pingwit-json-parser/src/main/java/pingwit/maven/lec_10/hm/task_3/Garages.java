package pingwit.maven.lec_10.hm.task_3;

public class Garages<T> {
    public static <BMW extends Car, LADA extends Car, AllCars extends Car> void main(String[] args) {
        Garage<BMW> bmwGarage = new Garage<>();
        Garage<LADA> ladaGarage = new Garage<>();
        Garage<AllCars> allCarsGarage = new Garage<>();


    }
}
