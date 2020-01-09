package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

public class Guest {
    
    private IntegerProperty guest_id;
    private StringProperty glast;
    private StringProperty gfirst;
    private StringProperty gstreet;
    private StringProperty gcity;
    private StringProperty gstate;
    private StringProperty gnation;    
    private IntegerProperty gzip;
    private StringProperty gphone;
    private IntegerProperty employee_id;
    
    public Guest(){
        this.guest_id = new SimpleIntegerProperty();
        this.glast = new SimpleStringProperty();
        this.gfirst = new SimpleStringProperty();
        this.gstreet = new SimpleStringProperty();
        this.gcity = new SimpleStringProperty();
        this.gstate = new SimpleStringProperty();
        this.gnation = new SimpleStringProperty();        
        this.gzip = new SimpleIntegerProperty();
        this.gphone = new SimpleStringProperty();
        this.employee_id = new SimpleIntegerProperty();
    }
    
    //Returns guest_id *BEGIN*
    public int getGuest_Id() {
        return guest_id.get();
    }
 
    public void setGuest_Id(int guest_id){
        this.guest_id.set(guest_id);
    }
 
    public IntegerProperty guest_IdProperty(){
        return guest_id;
    }
    
    //Returns glast *BEGIN* 
    public String getGLast () {
        return glast.get();
    }
 
    public void setGLast(String glast){
        this.glast.set(glast);
    }
 
    public StringProperty gLastProperty() {
        return glast;
    }
    
    //Returns gfirst *BEGIN* 
    public String getGFirst () {
        return gfirst.get();
    }
 
    public void setGFirst(String gfirst){
        this.gfirst.set(gfirst);
    }
 
    public StringProperty gFirstProperty() {
        return gfirst;
    }
    
    //Returns gstreet *BEGIN*
    public String getGStreet () {
        return gstreet.get();
    }
 
    public void setGStreet(String gstreet){
        this.gstreet.set(gstreet);
    }
 
    public StringProperty gStreetProperty() {
        return gstreet;
    }
    
    //Returns gcity *BEGIN* 
    public String getGCity () {
        return gcity.get();
    }
 
    public void setGCity(String gcity){
        this.gcity.set(gcity);
    }
 
    public StringProperty gCityProperty() {
        return gcity;
    }
    
    //Returns gstate *BEGIN* 
    public String getGState () {
        return gstate.get();
    }
 
    public void setGState(String gstate){
        this.gstate.set(gstate);
    }
 
    public StringProperty gStateProperty() {
        return gstate;
    }
    
    //Returns gnation *BEGIN* 
    public String getGNation () {
        return gnation.get();
    }
 
    public void setGNation(String gnation){
        this.gnation.set(gnation);
    }
 
    public StringProperty gNationProperty() {
        return gnation;
    }
    
    //Returns gzip *BEGIN*
    public int getGZip() {
        return gzip.get();
    }
 
    public void setGZip(int gzip){
        this.gzip.set(gzip);
    }
 
    public IntegerProperty gZipProperty(){
        return gzip;
    }
    
    //Returns gphone *BEGIN*
    public String getGPhone () {
        return gphone.get();
    }
 
    public void setGPhone(String gphone){
        this.gphone.set(gphone);
    }
 
    public StringProperty gPhoneProperty() {
        return gphone;
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
}
