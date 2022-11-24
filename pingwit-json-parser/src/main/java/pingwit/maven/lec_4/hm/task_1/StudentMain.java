package pingwit.maven.lec_4.hm.task_1;

public class StudentMain extends StudentBuilder {
    private static Student Egorka;

    public static void main(String[] args) {
        Student Billiard = new StudentBuilder().setAge(18).setName("PatrickBilliard").createStudent();
        Student StarTrack = new StudentBuilder().setAge(21).setName("LesliStarTrack").createStudent();
        Billiard.show();
        StarTrack.toString();

//        Egorka.show();

        Student Jackson = new StudentBuilder().setAge(22).setName("Harry").createStudent();

    }
}


