package guithreadsample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author brianaranda
 */
public class GUIThreadSample implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GUIThreadSample());// TODO code application logic here
    }
    
    @Override
    public void run(){
        MainWindow window = new MainWindow();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
