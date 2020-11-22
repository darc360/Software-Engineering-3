//Written By Darcie Howley
//Libraries
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    private String moduleName = "Software Engineering III";
    private String ID = "CT417";
    private ArrayList<CourseProgramme> relatedCourses = null;
    private Module module = new Module(moduleName,ID);

//tests creation of Module
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


}
