package edu.hpu.caranda.the_simple_program;

import java.util.Scanner;

public class The_Simple_Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        boolean is_valid = false;

        System.out.println("Hello there, are you human?");
        in = input.nextLine();

        if (in.matches("Yes|yes|YES|Y|y")) {
            is_valid = true;
            System.out.println("Good for you.");
        } else if (in.matches("No|no|NO|N|n")) {
            is_valid = true;
            while (in.matches("No|no|NO|N|n")) {
                System.out.println("Are you sure?");
                in = input.nextLine();
                if (in.matches("Yes|yes|Yes|Y|y")) {
                    System.out.println("That's what I thought. Good for you.");
                }
            }

        } else {
            is_valid = false;
            while ((!(in.matches("Yes|yes|YES|Y|y")) || !(in.matches("No|no|NO|N|n"))) && is_valid == false) {
                System.out.println("You idiot. You didn't answer my question.");
                System.out.println("Are you human?");
                in = input.nextLine();

                if (in.matches("Yes|yes|YES|Y|y")) {
                    is_valid = true;
                    System.out.println("Great. Good for you.");
                } else if (in.matches("No|no|NO|N|n")) {
                    is_valid = true;
                    while (in.matches("No|no|NO|N|n")) {
                        System.out.println("Are you sure?");
                        in = input.nextLine();
                        if (in.matches("Yes|yes|Yes|Y|y")) {
                            System.out.println("That's what I thought. Good for you.");
                        }
                    }
                }

            }

        }
    }
}
