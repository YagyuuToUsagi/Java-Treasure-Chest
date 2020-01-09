package javaapplication46;

import java.util.Scanner;

public class JavaApplication46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String woop;

        System.out.println("Type something: ");
        woop = input.nextLine();

        if (woop.matches("[Dd]og*")) {
            System.out.println("Yes");
        }
        if (!woop.matches("[Dd]og*")){
            System.out.println("No");
        }
    }

}
