package edu.hpu.caranda.woohoo_aninterestingimageproject;

import java.io.*;
import java.util.Scanner;

public class WooHoo_AnInterestingImageProject {

    public static int[][] readPGMfile(String filename) throws IOException {
        Scanner file = new Scanner(new File(filename)); //Opens file
        String magicNumber = file.next(); //Reads the next string of file
        System.out.println(magicNumber); //Prints out the "Magic Number"

        int w = file.nextInt(); //Displays width
        int h = file.nextInt(); //Display height
        int maxValue = file.nextInt(); //Displays max value

        int[][] pixles = new int[h][w];
        for (int i = 0; i < h; ++i) { //Loops through the height
            for (int j = 0; j < w; ++j) { //Loops through the width
                pixles[i][j] = file.nextInt(); //??? 
            }
        }
        return pixles;
    }

    public static int[][] invertImage(int[][] origin) {
        int[][] originImage = origin;
        int[][] invertedImage = new int[originImage.length][originImage[0].length];

        for (int i = 0; i < originImage.length; ++i) { //Loops through the height
            for (int j = 0; j < originImage[0].length; ++j) { //Loops through the width
                invertedImage[i][j] = 255 - originImage[i][j];
            }
        }
        return invertedImage;
    }

    public static void main(String[] args) throws IOException {

//        int[][] pixles = new int[256][512]; //Declares and initializes an interger array called pixles
//        //int[# of columns][# of rows]
        ImageDisplay image = new ImageDisplay();

//
//        for (int rows = 0; rows < 256; ++rows) { //Loops through the rows
//            int i = 0;
//            for (int columns = 0; columns < 512; ++columns) { //Loops through the columns
//                
//                pixles[rows][columns] = 255 - i/2; //??? 
//                ++i;                    
//
//
//            }
//        }
        int[][] picture = readPGMfile("testPic.pgm");
//      int[][] invertedPicture=invertImage(picture);
        image.showImage(picture);
        //Takes filename and returns an array of pixles
        //Feeds the array to shpwImage method, showing the image

    }

}
