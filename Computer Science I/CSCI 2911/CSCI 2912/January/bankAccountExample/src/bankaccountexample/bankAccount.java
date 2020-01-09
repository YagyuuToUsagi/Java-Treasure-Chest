package bankaccountexample;


public class bankAccount {
   
    private double Balance;
    private static double interestrate=0.02;
    private PersonalInfo person;
    
    public bankAccount (double Balance, PersonalInfo person){ //Constructor 1
        this.Balance=Balance;
        this.person=person;

    }
    
    public bankAccount(double Balance){ //Constructor 2
        this(Balance, new PersonalInfo());
    }
    
    
    public double getBalance(){ //Get method that returns balance.
        return Balance;
    }

    public double getInterestRate(){ //Get method that returns interest rate.
        return interestrate;
    }
    
    public PersonalInfo getPersonalInfoReferenceCopy(){
        return person;
    }
    
    public PersonalInfo getPersonalInfoDeepCopy(){
        return new PersonalInfo(person.getUsername(),person.getPassword());
    }
    
    public void setBalance(double newBalance){
        this.Balance=newBalance;
    }
    
    public void setInterest(double newRate){
        this.interestrate=newRate;
    }
    
    public void setPersonalInfo(PersonalInfo person){
        this.person=person;
    }
}
