package arandachristopher2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aranda, Christopher
 * @assignment CSCI 2911
 * @DueDate February 18th, 2017 (11:59 PM)
 */
public class ArandaChristopher2 {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        boolean quit;

        System.out.println("~ Address Book Menu ~ \n"
                + "+-------------------------+\n"
                + "ADD (Adds a contact)\n"
                + "FIND (Finds contacts)\n"
                + "PRINT (Prints contacts)\n"
                + "QUIT (Quits)\n"
                + "+-------------------------+\n");
        command = input.nextLine();
        if (quit) {
            if (command.matches("A|a|add|ADD")) {
                contact.addCon();
            } else if (command.matches("F|f|find|FIND")) {

            } else if (command.matches("P|p|Print|PRINT")) {
                System.out.println(contactList);
            } else if (command.matches("Q|q|quit|QUIT")) {
            } else {

            }

        }
        else{
            
        }

    }
}
