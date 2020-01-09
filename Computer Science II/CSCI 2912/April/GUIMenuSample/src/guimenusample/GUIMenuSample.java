/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimenusample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author brianaranda
 */
public class GUIMenuSample extends JFrame {

    private JPanel panel;

    public GUIMenuSample() {
        setTitle("Menu Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildMenu();
        setVisible(true);
    }

    public void buildMenu() {
        final JMenuItem open = new JMenuItem("Open");
        final JMenuItem save = new JMenuItem("Save");
        final JMenuItem color = new JMenuItem("Color");
        final JMenuItem exit = new JMenuItem("Exit");
        final JRadioButtonMenuItem item1 = new JRadioButtonMenuItem("Koala", true);
        final JRadioButtonMenuItem item2 = new JRadioButtonMenuItem("Turing Machine");

        final JMenu menu = new JMenu("PandaExpress");

        menu.add(open);
        menu.add(save);
        menu.addSeparator();
        menu.add(color);
        menu.addSeparator();
        menu.add(item1);
        menu.add(item2);
        menu.addSeparator();
        menu.add(exit);

        final JMenuBar bar = new JMenuBar();
        bar.add(menu);
        this.setJMenuBar(bar); //Differnt adding process 

        final JLabel label = new JLabel("");
        this.add(label);
        //First create the ColorChooser

        color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            final Color selected= 
                    JColorChooser.showDialog(GUIMenuSample.this, "Color Chooser Example", Color.BLUE);
            label.setIcon(null);
            label.setText("Selected color is "+selected);

            }
        });
        
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser filechooser=new JFileChooser();
                if(filechooser.showOpenDialog(GUIMenuSample.this)==JFileChooser.APPROVE_OPTION){
                    final File selected = filechooser.getSelectedFile();
                    
                    try{
                        final Scanner scanner= new Scanner(selected);
                        int count=0;
                        while(scanner.hasNextLine()){
                            count++;
                            System.out.println(scanner.nextLine());
                        }
                        label.setIcon(null);
                        label.setText("The total number of lines is"+count);
                    } catch (FileNotFoundException ex) {
                        System.err.println("File nto found.");
                    }
                    
                }
            }
        });
    
    
    exit.addActionListener(new ActionListener(){
         

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
    });

    public static void main(String[] args) {
        new GUIMenuSample();

    }

}
