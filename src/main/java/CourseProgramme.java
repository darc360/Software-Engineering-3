//Written By Darcie Howley
//libraries
import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {
//declaration
    private String courseName;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private DateTime start;
    private DateTime end;

//constructor

    public CourseProgramme(String courseName, DateTime start, DateTime end) {
        this.courseName = courseName;
        this.start = start;
        this.end = end;
    }

    //getter
    public String getCourseName() {
        return courseName;
    }
//setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
//getter
    public ArrayList<Module> getModules() {
        return modules;
    }
//setter
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
//add method
    public void addModule(Module modules) {
        this.modules.add(modules);
    }
//getter
    public ArrayList<Student> getStudents() {
        return students;
    }
//add method
    public void addStudent(Student student) {
        this.students.add(student);
    }
//setter
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
//getter
    public DateTime getStart() {
        return start;
    }
//setter
    public void setStart(DateTime start) {
        this.start = start;
    }
//getter
    public DateTime getEnd() {
        return end;
    }
//setter
    public void setEnd(DateTime end) {
        this.end = end;
    }
    //tostrings to allow printing in driver class
    @Override
    public String toString(){
        return courseName;
    }
    public String getInfo(){

        return "Course:"+courseName + " Start Date:" + start.toDateTime() +" End Date:" + end.toDateTime() ;

    }
}