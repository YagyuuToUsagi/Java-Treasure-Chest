package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;
/**
 *
 * @author brianaranda
 */
public class Skills {
    private IntegerProperty employee_id;
    private StringProperty eSkill;
    
    //Constructor
    public Skills() {
        this.employee_id = new SimpleIntegerProperty();
        this.eSkill = new SimpleStringProperty();
    }
    
    //Returns employee_id *BEGIN*
    public int getEmployeeId() {
        return employee_id.get();
    }
 
    public void setEmployeeId(int employeeId){
        this.employee_id.set(employeeId);
    }
 
    public IntegerProperty employeeIdProperty(){
        return employee_id;
    }
    
    //Returns eSkill *BEGIN*
    public String getESkill () {
        return eSkill.get();
    }
 
    public void setESkill(String eSkill){
        this.eSkill.set(eSkill);
    }
 
    public StringProperty eSkillProperty() {
        return eSkill;
    }
}
