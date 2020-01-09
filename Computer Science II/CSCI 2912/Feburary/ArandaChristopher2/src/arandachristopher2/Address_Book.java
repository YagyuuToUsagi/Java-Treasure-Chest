package arandachristopher2;
import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book {
    
    private ArrayList<Contact> contactList=new ArrayList<>();
    Scanner input=new Scanner (System.in);
    
    public static void addCon(Contact contact){
        System.out.println("Please enter the name and phone number:");
        
    }
    
    public String findCon(String search){
        System.out.println("Please enter the contact name"
                + " you're looking for: ");
        
    }
    
    public String toString(){
        return contact.toString();
    }
}
