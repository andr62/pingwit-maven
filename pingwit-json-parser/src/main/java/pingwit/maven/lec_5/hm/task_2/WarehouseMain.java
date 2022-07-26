package pingwit.lec_5.hm.task_2;

public class WarehouseMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{1, 2, 3});

        System.out.println(warehouse.next());
        System.out.println(warehouse);
        int[] array = warehouse.getArray();
    }
}
