package pingwit.maven.lec_4.hm.task_1;

public class Student {
    private static Integer age;
    private static String name;
    private boolean Male = true;

    public Student(Integer age, String name) {
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


//
//    public Student(Integer age, String name, true.Boolean) {
//        this.age = age;
//        this.name = name;
//        this.Male = true;
//    }


//    public Integer setAge() {
//        return age;
//    }
//
//    public String setName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Student() {
//        this(19, "Egorka");
//    }

//    public String toString() {
//        return "Student{" + "age='" + getAge() + '\'' +
//                ", name'" + getName() + '\'' +
//                '}';
//
//    }

    public void show() {

        System.out.println("Student's profile age: " + Student.age);
        System.out.println("Students's profile name: " + Student.name);
    }
}

