package pingwit.lec_10.hm.task_1;

public class GenericMain {
    public static void main(String[] args) {
        Generic<String, String> stringId = new Generic<>("123", "Lusi");
        Generic<Integer, String> integerId = new Generic<>(666, "George");
//        stringId.printClassName();
//        System.out.println(stringId.getName() + " " + stringId.getId());
        System.out.println("sout1" + stringId.getName());
        System.out.println("sout2" + stringId.getClass().getName());
//        System.out.println(stringIdValue);
        stringId.printClassName();
        integerId.printClassName();
    }

}
