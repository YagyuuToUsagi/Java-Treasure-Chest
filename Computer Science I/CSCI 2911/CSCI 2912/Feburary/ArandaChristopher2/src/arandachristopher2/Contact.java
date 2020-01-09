package arandachristopher2;

public class Contact {

    private String n, p;
    //Intializes String varibles n and p

    private Contact(String name, String phone) { //Constructs the Contact method
        this.n = name;
        this.p = phone;
        //Initializes private variables n and p to
        //number and phone
    }

    public String toString() {
        String contact=n+";"+p;
        return contact;
    }

}
