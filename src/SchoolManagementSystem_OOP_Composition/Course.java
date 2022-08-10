package SchoolManagementSystem_OOP_Composition;

import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> students;


    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
//        this.students = students;

    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

}
