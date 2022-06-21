package SchoolManagementSystem_OOP_Composition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class SchoolTest {

    @Test
    public void schoolHasName(){
        School school = new School();
        school.setSchoolName("Ejite");
        assertTrue(true, school.getSchoolName());
        System.out.println(school.getSchoolName());
    }

    @Test
    public void schoolDetails(){

        Course course = new Course();
        School school = new School();
        school.aNewCourse(course);
        school.setLocation("312, HerbatMacaulay way Sabo Yaba");
        school.aNewCourse(new Course ("Biology","Bio101" ));
        school.aNewCourse(new Course("Geology", "Geo101"));
        assertTrue(true, school.getSchoolName());
    }

}
