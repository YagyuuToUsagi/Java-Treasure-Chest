package jungle;

import java.io.*;
import java.awt.*;
import javax.swing.*;


public class jungle {

    public static void main(String s[]) {
        JButton open = new JButton(); //Creat button
        
        JFileChooser fc = new JFileChooser(); //Create File chooser
        
        //Sets current directory to project location
        fc.setCurrentDirectory(new java.io.File("."));
        
        fc.setDialogTitle("Hello World");
        
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        //Start to open up file chooser
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            //
        }
        System.out.println("File selected: "+fc.getSelectedFile().getAbsolutePath());
        }
    }
