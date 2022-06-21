package SchoolManagementSystem_OOP_Composition;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int studentID;
    private ArrayList<Course> listOfCourses;


    public Student(String firstName, String lastName, int studentID, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        listOfCourses = new ArrayList<>();

    }

    public Student(String firstName, String lastName, String studentId) {

    }

    public Student() {

    }

    public void addNewCourse(Course newCourse) {

        this.listOfCourses.add(newCourse);
    }

    public String getCourseName(String courseName) {
        for (int i = 0; i < listOfCourses.size(); i++) {
            if (listOfCourses.get(i).getCourseName() == courseName) {
                return courseName;
            }
        }
        return courseName;

    }
    public int getStudentID(){
        return studentID;
    }
    public String getStudentName(){
        return firstName +" "+ lastName;
    }
    public String toString() {
        String list = "";
        for (int i = 0; i < listOfCourses.size(); i++) {
            list += listOfCourses.get(i).toString();
        }
        return list;
    }

}


