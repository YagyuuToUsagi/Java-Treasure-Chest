package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

public class PlacesToAvoid {

    private IntegerProperty employee_id;
    private StringProperty avoidPlace;
    private StringProperty location_id;
    private IntegerProperty guest_id;
    
    public PlacesToAvoid() {
        this.employee_id = new SimpleIntegerProperty();
        this.avoidPlace = new SimpleStringProperty();
        this.location_id = new SimpleStringProperty();
        this.guest_id = new SimpleIntegerProperty();
    }

    //Returns employee_id *BEGIN*
    public int getEmployeeId() {
        return employee_id.get();
    }
 
    public void setEmployeeId(int employee_Id){
        this.employee_id.set(employee_Id);
    }
 
    public IntegerProperty employeeIdProperty(){
        return employee_id;
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
    
    //Returns avoidPlace *BEGIN*
    public String getavoidPlace () {
        return avoidPlace.get();
    }
 
    public void setAvoidPlace(String avoidPlace){
        this.avoidPlace.set(avoidPlace);
    }
 
    public StringProperty avoidPlaceProperty() {
        return avoidPlace;
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
