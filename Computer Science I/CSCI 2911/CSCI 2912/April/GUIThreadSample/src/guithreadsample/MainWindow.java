package guithreadsample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author brianaranda
 */
public class MainWindow extends JFrame {

    private static long serialVersionUID = -3058699892319739488L;

    public MainWindow() {
        super("Slider Demo");
        this.setSize(200, 250);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        final JSlider slider=new JSlider(SwingConstants.VERTICAL, 0,100, 80); 
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(2);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        this.add(slider);
        
        final JLabel label=new JLabel("Grade Look Up");
        this.add(label);
        
        slider.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int grade=slider.getValue();
                char letterGrade=convertGrade(grade);
                label.setText("Grade: "+grade+" -> "+letterGrade);
                
            }
            private char convertGrade(int grade){
                if(grade<60) return 'F';
                if(grade<70) return 'D';
                if(grade<80) return 'C';
                if(grade<90) return 'B';
                return 'A';
                
            }
            
        });
        

    }
}
