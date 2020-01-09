package dankesttourismprogram;



import javafx.beans.property.*;
import java.sql.Date;

public class Company {
    
    private IntegerProperty company_id;
    private StringProperty cname;
    private StringProperty cstreet;
    private StringProperty ccity;
    private StringProperty cstate;
    private IntegerProperty czip;
    private StringProperty cphone;
    
    public Company(){
        this.company_id = new SimpleIntegerProperty();
        this.cname = new SimpleStringProperty();
        this.cstreet = new SimpleStringProperty();
        this.ccity = new SimpleStringProperty();
        this.cstate = new SimpleStringProperty();
        this.czip = new SimpleIntegerProperty();
        this.cphone = new SimpleStringProperty();
        
    }
    
    //Returns company_id *BEGIN*
    public int getCompanyId() {
        return company_id.get();
    }
 
    public void setCompanyId(int company_id){
        this.company_id.set(company_id);
    }
 
    public IntegerProperty companyIdProperty(){
        return company_id;
    }
    
    //Returns cname *BEGIN*
    public String getCName () {
        return cname.get();
    }
 
    public void setCName(String cname){
        this.cname.set(cname);
    }
 
    public StringProperty cNameProperty() {
        return cname;
    }
    
    //Returns cstreet *BEGIN*
    public String getCStreet () {
        return cstreet.get();
    }
 
    public void setCStreet(String cstreet){
        this.cstreet.set(cstreet);
    }
 
    public StringProperty cStreetProperty() {
        return cstreet;
    }
    
    //Returns ccity *BEGIN* 
    public String getCCity () {
        return ccity.get();
    }
 
    public void setCCity(String ccity){
        this.ccity.set(ccity);
    }
 
    public StringProperty cCityProperty() {
        return ccity;
    }
    
    //Returns cstate *BEGIN* 
    public String getCState () {
        return cstate.get();
    }
 
    public void setCState(String cstate){
        this.cstate.set(cstate);
    }
 
    public StringProperty cStateProperty() {
        return cstate;
    }
    
    //Returns czip *BEGIN*
    public int getCZip() {
        return czip.get();
    }
 
    public void setCZip(int czip){
        this.czip.set(czip);
    }
 
    public IntegerProperty cZipProperty(){
        return czip;
    }
    
    //Returns cphone *BEGIN*
    public String getCPhone () {
        return cphone.get();
    }
 
    public void setCPhone(String cphone){
        this.cphone.set(cphone);
    }
 
    public StringProperty cPhoneProperty() {
        return cphone;
    }
}
