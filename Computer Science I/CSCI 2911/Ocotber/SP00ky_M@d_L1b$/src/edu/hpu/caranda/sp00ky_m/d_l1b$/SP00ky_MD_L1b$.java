package edu.hpu.caranda.sp00ky_m.d_l1b$;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class SP00ky_MD_L1b$ {

    static Random bag = new Random();

    public static String exclamation() {
        String[] s = {"Crap!", "Oh!", "Shit!", "Fuck!", "YEET!", "Hot damn!"};
        int i = bag.nextInt(s.length);
        String exclamation = s[i];
        return exclamation;
    }

    public static String actionverb() {
        String[] a = {"run", "kill", "shoot", "dab", "throw", "yank"};
        int i = bag.nextInt(a.length);
        String actVerb = a[i];
        return actVerb;
    }

    public static String adverb() {
        String[] b = {"quickly", "slowly", "stealthily", "harshly", "spookily", "badly"};
        int i = bag.nextInt(b.length);
        String adverb = b[i];
        return adverb;
    }

    public static String adjective() {
        String[] c = {"horrible", "swaggish", "rediculous", "crappy", "flawless", "dope"};
        int i = bag.nextInt(c.length);
        String adjective = c[i];
        return adjective;
    }

    public static String noun() {
        String[] d = {"dank meme", "M9", "machete", "AK-47", "box of steroids", "a penis"};
        int i = bag.nextInt(d.length);
        String noun = d[i];
        return noun;
    }

    public static String animal() {
        String[] e = {"hamster", "elephant", "kiwi", "cat", "shark", "piranha"};
        int i = bag.nextInt(e.length);
        String animal = e[i];
        return animal;
    }

    public static String halloweentreat() {
        String[] f = {"Butterfinger", "Snickers", "Kit-Kat", "M&Ms", "Pocky", "Ass"};
        int i = bag.nextInt(f.length);
        String halloweentreat = f[i];
        return halloweentreat;
    }

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(new File("HalloweenMadLibs.txt"));

        while (read.hasNext()) {

            String line = read.nextLine(); //Reads the txt file one line at a time
            String[] words = line.split(" +"); //Splits the line into Strings

            for (int i = 0; i < words.length; ++i) {
                if (words[i].charAt(0) == '_') { //Checks for _ in the first letter of words
                    if (words[i].equals("_exclamation_")) {
                        System.out.print(exclamation()+" ");
                    } else if (words[i].equals("_actionverb_")) {
                        System.out.print(actionverb()+" ");
                    } else if (words[i].equals("_adverb_")) {
                        System.out.print(adverb()+" ");
                    } else if (words[i].equals("_adjective_")) {
                        System.out.print(adjective()+" ");
                    } else if (words[i].equals("_noun_")) {
                        System.out.print(noun()+" ");
                    } else if (words[i].equals("_animal_")) {
                        System.out.print(animal()+" ");
                    } else if (words[i].equals("_halloweentreat_")) {
                        System.out.print(halloweentreat()+" ");
                    } else {
                        System.out.print("Oh noes! An Error!");
                    }

                } else {
                    System.out.print(words[i] + " ");
                }
            }
            System.out.print("\n");
        }
    }

}
