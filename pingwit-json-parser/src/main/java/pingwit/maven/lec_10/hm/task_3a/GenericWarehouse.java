package pingwit.lec_10.hm.task_3a;

public class GenericWarehouse<T> {
    private T[] carTypes;

    public GenericWarehouse(T[] carTypes) {
        this.carTypes = carTypes;
    }
}