//Written By Darcie Howley
//libraries
import org.junit.*;
import org.joda.time.DateTime;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseProgrammeTest {
//creating test instances
    private String courseName = "Electronic and Computer Engineering";
    private String newcourseName = "Biomed";
    private DateTime start = new DateTime(2020,6,25,0,0,0);
    private DateTime end = new DateTime(2021,6,25,0,0);

    private CourseProgramme course = new CourseProgramme(courseName,start,end);

//testing all course functions
    @Test
    public void testCourseCreation(){
        assertEquals(course.getCourseName(),courseName);
    }

    @Test
    public void testCourseMutation(){

        course.setCourseName(newcourseName);
        assertEquals(course.getCourseName(),newcourseName);

        course.setStart(start);
        assertEquals(course.getStart(),start);

        course.setEnd(end);
        assertEquals(course.getEnd(),end);
    }


}