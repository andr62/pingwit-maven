package pingwit.maven.lec_15.hm.task_1;

import java.util.Objects;

public final class Student {
    private final String groudID;
    private final String name;
    private final String surname;
    private final String faculty;

    public Student(String groudID, String firstName, String lastName, String faculty, String favouriteClassFirst, String favouriteClassSecond) {
        this.groudID = groudID;
        this.name = firstName;
        this.surname = lastName;
        this.faculty = faculty;
    }

    public String groudID() {
        return groudID;
    }

    public String name() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public String faculty() {
        return faculty;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Student) obj;
        return Objects.equals(this.groudID, that.groudID) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.surname, that.surname) &&
                Objects.equals(this.faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groudID, name, surname, faculty);
    }

    @Override
    public String toString() {
        return "Student[" +
                "groudID=" + groudID + ", " +
                "name=" + name + ", " +
                "surname=" + surname + ", " +
                "faculty=" + faculty + ']';
    }
}
