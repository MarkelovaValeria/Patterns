package CodeSmells.newLab6.part2.changeUnidirectionalAssociationToBidirectional;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title){
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
            student.enrollCourse(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }
}
