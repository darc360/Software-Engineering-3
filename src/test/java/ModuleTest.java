import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    private String moduleName = "Software Engineering";
    private String ID = "CT417";
    private ArrayList<CourseProgramme> relatedCourses = null;
    private Module module = new Module(moduleName,ID);

    @Test
    public void testModuleCreation() {
        assertTrue(module.getModuleName().equals(moduleName));
        assertTrue(module.getID().equals(ID));
    }

    @Test
    public void testModuleAlteration(){
        String newmoduleName = "Machine Learning";
        String newID   = "CT4101";

        module.setModuleName(newmoduleName);
        assertEquals(module.getModuleName(),newmoduleName);
        module.setID(newID);
        assertEquals(module.getID(),newID);
    }

    @Test
    public void testStudentAddition(){
        Student student1 = new Student("Darcie", new DateTime(2005,10,4,0,0));
        Student student2 = new Student("Ciaran", new DateTime(1997,10,15,0,0));
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        module.setStudents(students);
        assertEquals(module.getStudents(),students.toString());
    }

    @Test
    public void testCourse(){
        ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering");
        CourseProgramme course2 = new CourseProgramme("Biomed");

        assertEquals(module.getCourses(),courses);

        courses.add(course1);
        module.addCourse(course1);

        assertEquals(module.getCourses(),courses);

        courses.add(course2);
        module.setCourses(courses);

        assertEquals(module.getCourses(),courses);

    }
}
