/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svg_assignment4;

import java.util.ArrayList;
import java.io.PrintStream;
/**
 *
 * @author brianaranda
 */
abstract class Shape {

    //Shape instance variables
    private ArrayList<String> styles;

    //Shape constructor
    public Shape() {
        styles = new ArrayList<String>();
    }

    public void addStyle(String key, String value) {

    }

    void render(PrintStream out) {

    }
    
    void printStyle(){
        for(int i =0; i < styles.size();++i){
            System.out.println(styles.get(i));
        }
    }

    abstract void renderAttributes(PrintStream out);
}

