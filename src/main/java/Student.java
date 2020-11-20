//libraries
import org.joda.time.DateTime;
import org.joda.time.Years;
import java.util.ArrayList;

public class Student {
//declaration
    private String Name;
    private int Age;
    private DateTime DOB;
    private int ID;
    private String userName;
    private CourseProgramme course;
    private ArrayList<Module> modules = new ArrayList<>();

//intialising ID as 0
    static int IDs = 0;
//constructor
    public Student(String Name, DateTime DOB){
        this.Name = Name;
        this.DOB = DOB;
        this.ID = ID++;
        setAge();


    }
//getter
    public String getUserName(){
        this.userName = Name + Age;
        return userName;
    }
//getter
    public int getAge() {
        return Age;
    }
//setter
    public void setAge(){
        this.Age = Years.yearsBetween(DOB, new DateTime()).getYears();
    }
//setter
    public String getName() {
        return Name;
    }
//setter
    public void setName(String Name) {
        this.Name = Name;
    }
//getter
    public DateTime getDOB() {
        return DOB;
    }
//setter
    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
        setAge();
    }
//getter
    public CourseProgramme getCourse() {
        return course;
    }
//setter
    public void setCourse(CourseProgramme course) {
        this.course = course;
    }
//getter
    public ArrayList<Module> getModules() {
        return modules;
    }
//add method
    public void addModule(Module module) {
        this.modules.add(module);
    }
}