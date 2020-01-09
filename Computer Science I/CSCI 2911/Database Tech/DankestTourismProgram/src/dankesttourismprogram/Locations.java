package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

public class Locations {
    private StringProperty location_id;
    private StringProperty region;
    
    public Locations(){
        this.location_id = new SimpleStringProperty();
        this.region = new SimpleStringProperty();
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
    
    //Returns region *BEGIN*
    public String getRegion () {
        return region.get();
    }
 
    public void setRegion(String region){
        this.region.set (region);
    }
 
    public StringProperty regionProperty() {
        return region;
    }
}
