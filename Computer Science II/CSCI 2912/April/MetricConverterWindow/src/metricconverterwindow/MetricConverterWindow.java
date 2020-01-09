package metricconverterwindow;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author brianaranda
 */
public class MetricConverterWindow extends JFrame{
    
    private int WINDOW_WIDTH=400;
    private int WINDOW_HEIGHT=200;
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;    
    private JRadioButton milesButton;
    private JRadioButton feetButton;
    private JRadioButton inchesButton;
    private ButtonGroup group;
    private JButton OK_fam;
    private JTextField displayText;
    
    
    
    public MetricConverterWindow(){
        //Sets the title
        setTitle("Metric Converter of Awesomeness");
        //Sets the window size
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        //Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Build the component and add them to the window
        buildPanel();
        add(panel);
        //Display window
        setVisible(true);
        
        
    }
    
    private void buildPanel(){
        messageLabel=new JLabel("Enter a distance in kilometers: ");
        kiloTextField=new JTextField(10);
        milesButton=new JRadioButton("Miles",true);
        milesButton.setMnemonic('M'); //ctrl+alt+M for Macs
        milesButton.setToolTipText("Converts from Kilometers to Miles");
        feetButton=new JRadioButton("Feet");
        feetButton.setMnemonic('F'); //ctrl+alt+F for Macs
        feetButton.setToolTipText("Converts from Kilometers to Feet");
        inchesButton=new JRadioButton("Inches");
        inchesButton.setMnemonic('I'); //ctrl+alt+I for Macs
        inchesButton.setToolTipText("Converts from Kilometers to Inches");
        OK_fam= new JButton("OK");
        OK_fam.setMnemonic('O'); //ctrl+alt+O for Macs
        OK_fam.addActionListener(new RadioButtonListener());
        OK_fam.setToolTipText("That's the OK button. Just click it.");

        displayText=new JTextField(30);
        displayText.setEditable(false);
        
//        feetButton.addActionListener(new RadioButtonListener());
//        inchesButton.addActionListener(new RadioButtonListener());

        group=new ButtonGroup();
        group.add(milesButton);
        group.add(feetButton);
        group.add(inchesButton);
        
        
        panel=new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(milesButton);
        panel.add(feetButton);
        panel.add(inchesButton);
        panel.add(OK_fam);
        panel.add(displayText);
        
    }
   
    
    private class RadioButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String input; 
            String convert_to="";
            double result=0.0;

            try{
                input = kiloTextField.getText();
                result = Double.parseDouble(input);
                
                if(milesButton.isSelected()){
                    result*=0.6214;
                    convert_to=" miles";
                }
                else if(feetButton.isSelected()){
                    result*=3281.0;
                    convert_to=" feet";
                }
                else if(inchesButton.isSelected()){
                    result*=39370.0;
                    convert_to=" inches";

                }
//                JOptionPane.showMessageDialog(null, input+"Kilometers are "+result+convert_to);
                String display=input+" kilometer(s) equals to "+result+convert_to;
                displayText.setText(display);
                
            }catch(Exception a){
                String display="Yo fam, your input is Invalid.";
                displayText.setText(display);

            }

        }
    
}
    
    public static void main(String[] args) {

        //Creates new window
        new MetricConverterWindow();

    }
    
}
