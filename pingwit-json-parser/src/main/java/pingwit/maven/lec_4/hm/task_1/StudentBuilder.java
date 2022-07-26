package pingwit.lec_4.hm.task_1;

public class StudentBuilder {
    private Integer age;
    private String name;

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Student createStudent() {
        return new Student(age, name);
    }
}