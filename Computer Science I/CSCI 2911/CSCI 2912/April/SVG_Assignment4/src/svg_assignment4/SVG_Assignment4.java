package svg_assignment4;

import java.util.Scanner;
import java.io.*;

/**
 * @author Aranda, Christopher
 * @assignment CSCI 2912 Assignment 4
 * @Date April 22th, 2017
 */
public class SVG_Assignment4 {

    public static void main(String[] args) throws IOException {
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        File myFile;

        do {//this do while loop is for input validation/making sure the file exists
            System.out.print("Enter file name here: ");
            String fileName = input.nextLine();
            myFile = new File(fileName);
            if (!fileName.matches(".*\\w.*")) {
                System.out.println("Invalid command-line arguments");
            } else if (fileName.matches(".*\\.txt.*\\w")) {
                System.out.println("Invalid command-line arguments");
            } else if (!myFile.exists()) {
                System.out.println("Failed to read input file " + fileName);
            } else {
                isValid = true;
            }
        } while (isValid == false);
        //checks to see if the file is completely empty
        if (myFile.length() == 0) {
            System.err.println("Empty File: No Values");
            System.exit(0);
        }

        Scanner fileScanner = new Scanner(myFile);
        //going through the entire file
        //Checks if the SVG header is valid
        String firstLn = fileScanner.next().toLowerCase();
        System.out.println("TYPE: " + firstLn);
        if (!firstLn.matches("svg")) {
            System.err.println("Invalid token: " + firstLn);
            System.exit(0);
        }
        double width = 0;
        double height = 0;
        System.out.println(width+" "+height);
        try {
            width = Double.parseDouble(fileScanner.next());
            height = Double.parseDouble(fileScanner.next());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage().replaceFirst("For input string: ", "Invalid token:"));
            System.exit(0);
        }
        //Creates a new SVG object
        Svg mySvg = new Svg(width, height);
        String token = "";
        //Continues while the file has more tokens
        //Checkpoint where shapes and styles are created
        while (fileScanner.hasNext()) {
            token = fileScanner.next().toLowerCase();

            if (token.matches("line")) {//need to add try catch?
                //Creates a line
                double x1 = Double.parseDouble(fileScanner.next());
                double y1 = Double.parseDouble(fileScanner.next());
                double x2 = Double.parseDouble(fileScanner.next());
                double y2 = Double.parseDouble(fileScanner.next());
                Line myLine = new Line(x1, y1, x2, y2);
                System.out.println(myLine);
                mySvg.addshape(myLine);

                //Next reading shape attributes
                String lToken1 = "";
                String lToken2 = "";
                do {
                    lToken1 = fileScanner.next().toLowerCase();
                    if (!lToken1.matches("end")) {
                        lToken2 = fileScanner.next().toLowerCase();
                        myLine.addStyle(lToken1, lToken2);
                        System.out.println("Key= " + lToken1 + ", Value= " + lToken2);
                    }
                } while (!lToken1.matches("end"));
            }
            if (token.matches("rect")) {//need to add try catch
                //Creates a rectangle
                double x = Double.parseDouble(fileScanner.next());
                double y = Double.parseDouble(fileScanner.next());
                double rWidth = Double.parseDouble(fileScanner.next());
                double rHeight = Double.parseDouble(fileScanner.next());
                Rectangle myRect = new Rectangle(x, y, rWidth, rHeight);
                System.out.println(myRect);
                mySvg.addshape(myRect);

                //next readigng shape attributes
                String rToken1 = "";
                String rToken2 = "";
                do {
                    rToken1 = fileScanner.next().toLowerCase();
                    if (!rToken1.matches("end")) {
                        rToken2 = fileScanner.next().toLowerCase();
                        myRect.addStyle(rToken1, rToken2);
                        System.out.println("Key= " + rToken1 + ", Value= " + rToken2);
                    }
                } while (!rToken1.matches("end"));
            }
            if (token.matches("circle")) {//need to add try catch
                //Creates a circle
                double cx = Double.parseDouble(fileScanner.next());
                double cy = Double.parseDouble(fileScanner.next());
                double rad = Double.parseDouble(fileScanner.next());
                Circle myCirc = new Circle(cx, cy, rad);
                System.out.println(myCirc);
                mySvg.addshape(myCirc);

                //next reading shape attributes
                String cToken1 = "";
                String cToken2 = "";
                do {
                    cToken1 = fileScanner.next().toLowerCase();
                    if (!cToken1.matches("end")) {
                        cToken2 = fileScanner.next().toLowerCase();
                        myCirc.addStyle(cToken1, cToken2);
                        System.out.println("Key= " + cToken1 + ", Value= " + cToken2);
                    }
                } while (!cToken1.matches("end"));
            }
        }
    }
}