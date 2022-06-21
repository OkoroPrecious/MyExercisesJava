package SchoolManagementSystem_OOP_Composition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student studentOne;
    Course course;


    @BeforeEach
    void setUp() {
        course = new Course("Physics", "Phy101");
        studentOne = new Student("Okoro", "Precious", 1122, course);
    }

    @Test
    public void testThatCourseIsAdded(){
        Course courseTwo = new Course("Chemistry", "Chem101");
        studentOne.addNewCourse(course);
        studentOne.addNewCourse(courseTwo);
        studentOne.addNewCourse(new Course ("Biology","Bio101" ));
        studentOne.addNewCourse(new Course("Geology", "Geo101"));
        assertEquals("Chemistry", studentOne.getCourseName("Chemistry"));

    }

}