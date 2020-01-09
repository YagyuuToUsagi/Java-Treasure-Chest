package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

public class Landmarks {
    
    private StringProperty lname;
    private IntegerProperty employee_id;
    private IntegerProperty guest_id;
    private StringProperty location_id;

    
    public Landmarks(){
    this.lname = new SimpleStringProperty();
    this.employee_id = new SimpleIntegerProperty();
    this.guest_id = new SimpleIntegerProperty();
    this.location_id = new SimpleStringProperty();
    }
    
    //Returns lname *BEGIN*
    public String getLName () {
        return lname.get();
    }
 
    public void setLName(String lname){
        this.lname.set (lname);
    }
 
    public StringProperty lNameProperty() {
        return lname;
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
    
    //Returns location_id *BEGIN*
    public String getLocation_Id () {
        return location_id.get();
    }
 
    public void setLocation_Id(String location_id){
        this.location_id.set (location_id);
    }
 
    public StringProperty location_IdProperty() {
        return location_id;
    }
}
