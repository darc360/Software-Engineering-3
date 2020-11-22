//Written By Darcie Howley
//Libraries
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest
{
    private DateTime DOB = new DateTime(1998,3,5,0,0);
    private int age = 22;
    private String name = "Darcie";
    private String userName = "Darcie22";
    private Student student = new Student(name, DOB);
    private String newName = "Eoin";
    private String newUserName = "Eoin3";
    private int newAge = 3;
    private DateTime newDOB = new DateTime(2017,10,15,0,0);
    private CourseProgramme course = null;
    private ArrayList<Module> module = new ArrayList<>();

    @Test
    public void testUserName() {
        assertTrue(student.getUserName().equals(userName));
    }

    @Test
    public void testAge(){
        assertTrue(student.getAge() == age);
    }

    @Test
    public void testStudentCreation(){
        assertTrue(student.getName().equals(name));
        assertTrue(student.getDOB().equals(DOB));
    }

    @Test
    public void testStudentAlterations(){
        student.setName(newName);
        assertEquals(student.getName(),newName);
        student.setDOB(newDOB);
        assertEquals(student.getAge(), newAge);
        assertEquals(student.getDOB(),newDOB);
        assertEquals(student.getUserName(),newUserName);
    }

    @Test
    public void testModule(){
        String name = "Software Engineering";
        String ID = "CT417";
        Module module = new Module(name,ID);
        Module module2 = new Module(name,ID);
        student.addModule(module);
        student.addModule(module2);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        modules.add(module2);
        assertEquals(student.getModules(),modules);

    }

    @Test
    public void testCourse(){
        CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering",new DateTime(2020,6,25,0,0,0), new DateTime(2021,5,25,0,0,0));
        student.setCourse(course);
        assertEquals(student.getCourse(),course);

    }
}
