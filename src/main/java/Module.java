//libraries
import java.util.ArrayList;

public class Module {
//declaration
    private String moduleName;
    private String ID;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<CourseProgramme> relatedCourses = new ArrayList();

//constructor
    public Module(String moduleName, String ID){
        this.moduleName = moduleName;
        this.ID = ID;
    }
//getter
    public String getModuleName() {
        return moduleName;
    }
//setter
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
//getter
    public String getID() {
        return ID;
    }
//setter
    public void setID(String ID) {
        this.ID = ID;
    }
//getter
    public String getStudents() {
        return students.toString();
    }
//add method
    public void setStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }
//getter
    public ArrayList<CourseProgramme> getCourses() {
        return relatedCourses;
    }
//add method
    public void addCourse(CourseProgramme course) {
        this.relatedCourses.add(course);
    }
//setter
    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.relatedCourses = courses;
    }
}
