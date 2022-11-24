package pingwit.maven.lec_4.hm.task_3;

import pingwit.maven.lec_4.hm.task_1.Student;
import pingwit.maven.lec_4.hm.task_1.StudentBuilder;
import pingwit.maven.lec_4.hm.task_1.Student;

public class SimilarObjectsDetection {
    public static void main(String[] args) {

        Student Egorov = new StudentBuilder().setAge(22).setName("Ignat").createStudent();

        String[] commonList = new String[5];
        for (int i = 0; i < commonList.length; i++) {
//            if (!(Student.getName == Student.getName)) {
//                commonList(Student) = Student;
        }
    }

}
