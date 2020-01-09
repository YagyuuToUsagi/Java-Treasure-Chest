package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

/**
 *
 * @author brianaranda
 */
public class Employee {
    //Employee Table Columns Declared 
    private IntegerProperty employee_id;
    private StringProperty elast;
    private StringProperty efirst;
    private StringProperty estreet;
    private StringProperty ecity;
    private StringProperty estate;
    private IntegerProperty ezip;
    private StringProperty ephone;
    private IntegerProperty company_id;
    
    //Constructor
    public Employee() {
        this.employee_id = new SimpleIntegerProperty();
        this.elast = new SimpleStringProperty();
        this.efirst = new SimpleStringProperty();
        this.estreet = new SimpleStringProperty();
        this.ecity = new SimpleStringProperty();
        this.estate = new SimpleStringProperty();
        this.ezip = new SimpleIntegerProperty();
        this.ephone = new SimpleStringProperty();
        this.company_id = new SimpleIntegerProperty();
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
    
    //Returns efirst *BEGIN*
    public String getFirstName () {
        return efirst.get();
    }
 
    public void setFirstName(String efirst){
        this.efirst.set(efirst);
    }
 
    public StringProperty firstNameProperty() {
        return efirst;
    }
    
    //Returns elast *BEGIN* 
    public String getLastName () {
        return elast.get();
    }
 
    public void setLastName(String elast){
        this.elast.set(elast);
    }
 
    public StringProperty lastNameProperty() {
        return elast;
    }
    
    //Returns estreet *BEGIN*
    public String getEStreet () {
        return estreet.get();
    }
 
    public void setEStreet(String eStreet){
        this.estreet.set(eStreet);
    }
 
    public StringProperty eStreetProperty() {
        return estreet;
    }
    
    //Returns ecity *BEGIN* 
    public String getECity () {
        return ecity.get();
    }
 
    public void setECity(String eCity){
        this.ecity.set(eCity);
    }
 
    public StringProperty eCityProperty() {
        return ecity;
    }
    
    //Returns estate *BEGIN* 
    public String getEState () {
        return estate.get();
    }
 
    public void setEState(String eState){
        this.estate.set(eState);
    }
 
    public StringProperty eStateProperty() {
        return estate;
    }
    
    //Returns ezip *BEGIN*
    public int getEZip() {
        return ezip.get();
    }
 
    public void setEZip(int ezip){
        this.ezip.set(ezip);
    }
 
    public IntegerProperty eZipProperty(){
        return ezip;
    }
    
    //Returns ephone *BEGIN*
    public String getEPhone () {
        return ephone.get();
    }
 
    public void setEPhone(String ephone){
        this.ephone.set(ephone);
    }
 
    public StringProperty ePhoneProperty() {
        return ephone;
    }
    
    //Returns company_id *BEGIN*
    public int getCompany_Id() {
        return company_id.get();
    }
 
    public void setCompany_Id(int company_id){
        this.company_id.set(company_id);
    }
 
    public IntegerProperty company_IdProperty(){
        return company_id;
    }
}

