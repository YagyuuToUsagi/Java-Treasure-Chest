/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hpu.caranda.names_project;
import java.io.*;

public class Names_Project {

    public static void main(String[] args) throws IOException {
        Name_Methods nm = new Name_Methods(10);
        nm.read("names.txt");
        System.out.println(nm.size());
        System.out.println(nm.alpha_order(""));
    }
    
}
