//Written By Darcie Howley
//libraries
import org.junit.*;
import org.joda.time.DateTime;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseProgrammeTest {
//creating test objects
    private String courseName = "Electronic and Computer Engineering";
    private String newcourseName = "Biomed";
    private DateTime start = new DateTime(2019,8,30,0,0);
    private DateTime end = new DateTime(2020,6,25,0,0);

    private CourseProgramme course = new CourseProgramme(courseName);

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

    @Test
    public void testStudentMutation(){

        ArrayList<Student> students = new ArrayList<Student>();

        assertEquals(course.getStudents(),students);

        Student student1 = new Student("Darcie",new DateTime(1998,3,5,0,0));
        Student student2 = new Student("Dale",new DateTime(1998,3,23,0,0));

        students.add(student1);
        course.setStudents(students);

        assertEquals(course.getStudents(),students);

        students.add(student2);
        course.addStudent(student2);

        assertEquals(course.getStudents(),students);
    }

    @Test
    public void testModule(){

        ArrayList<Module> modules = new ArrayList<Module>();
        Module module1 = new Module("Software engineering","CT123");
        Module module2 = new Module("Machine learning", "CT456");

        assertEquals(course.getModules(),modules);

        modules.add(module1);
        course.setModules(modules);

        assertEquals(course.getModules(),modules);

        modules.add(module2);
        course.addModule(module2);

        assertEquals(course.getModules(),modules);
    }
}