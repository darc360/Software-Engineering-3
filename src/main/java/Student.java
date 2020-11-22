//Written By Darcie Howley
//libraries
import org.joda.time.DateTime;
import org.joda.time.Years;
import java.util.ArrayList;

public class Student {
//declaration
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String userName;
    private CourseProgramme course;
    private ArrayList<Module> modules = new ArrayList<>();

//intialising ID as 0
    static int IDs = 0;
//constructor
    public Student(String name, DateTime DOB){
        this.name = name;
        this.DOB = DOB;
        this.ID = IDs++;
        setAge();


    }
//getter
    public String getUserName(){
        this.userName = name + age;
        return userName;
    }
//getter
    public int getAge() {
        return age;
    }
//setter
    public void setAge(){
        this.age = Years.yearsBetween(DOB, new DateTime()).getYears();
    }
//setter
    public String getName() {
        return name;
    }
//setter
    public void setName(String name) {
        this.name = name;
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
//toString to allow printing in driver class
    @Override
    public String toString(){
        return name;
    }
    public String getInfo(){
        return  "Name:" + name + " Age:" + age +" ID" + ID;
    }
}