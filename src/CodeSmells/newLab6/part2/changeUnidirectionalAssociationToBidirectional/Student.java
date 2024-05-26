package CodeSmells.newLab6.part2.changeUnidirectionalAssociationToBidirectional;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
        }
    }

}
