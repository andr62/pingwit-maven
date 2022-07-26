package pingwit.lec_3.hm.task_8;

public class PracticeMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());
    }
}

class Person {
    private long age;

    public long getAge() {
        return age;
    }
}
