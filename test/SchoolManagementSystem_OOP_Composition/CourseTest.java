package SchoolManagementSystem_OOP_Composition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Theology", "101");
    }

    @Test
    void testThatCourseNameIsSet(){

        assertEquals("Theology",course.getCourseName());
    }
    @Test
    void testThatCourseIDIsSet(){
        assertEquals(101,course.getCourseID());
    }

}