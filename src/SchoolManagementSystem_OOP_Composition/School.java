package SchoolManagementSystem_OOP_Composition;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private String location;
    private ArrayList<Student> student;
    private ArrayList<Course> course;

    public School(String schoolName, String location){
        this.schoolName = schoolName;
        this.location = location;
        this.course = new ArrayList<>();
        this.student = new ArrayList<>();
    }

    public School() {

    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setStudent(ArrayList<Student> student){
        this.student =student;
    }

    public ArrayList<Student> getStudent(){
        return student;
    }

    public void setCourse(ArrayList<Course> course){
        this.course = course;
    }
    public ArrayList<Course>  getCourse(){
        return course;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", location='" + location + '\'' +
                ", student=" + student +
                ", course=" + course +
                '}';
    }



    public void aNewCourse(Course newCourse) {

        this.course.add(newCourse);
    }
}

