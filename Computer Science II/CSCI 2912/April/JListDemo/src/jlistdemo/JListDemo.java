package jlistdemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 *
 * @author brianaranda
 */
public class JListDemo extends JFrame {

    private JPanel panel;
    private JList list;
    private JTextArea text;
    private JLabel label;
    private JScrollPane scollpanel1;
    private JScrollPane scollpanel2;
    private final String[] listItem = {"CSCI 1011", "CSCI 1041",
        "CSCI 2911", "CSCI 2912", "CSCI 2913", "CSCI 3101", "CSCI 3401",
        "CSCI 3501", "CSCI 3001", "CSCI 3601", "CSCI 3911", "CSCI 4911"};
    private int WIN_W = 450;
    private int WIN_H = 150;

    public JListDemo() {
        setTitle("CSCI Class Selection");
        setSize(WIN_W, WIN_H);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    private void buildPanel() {
        panel = new JPanel();
        label = new JLabel("Availiable CSCI Courses");
        panel.add(label);

        list = new JList(listItem);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scollpanel1 = new JScrollPane(list);
        panel.add(scollpanel1);
        list.setVisibleRowCount(5);
        list.addListSelectionListener(new selectionListener());
        
        text = new JTextArea(5, 10);
        text.setEditable(false);
        scollpanel2 = new JScrollPane(text);
        panel.add(scollpanel2);

    }

    private class selectionListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            final int[] selectindices = list.getSelectedIndices();
            final StringBuilder builder = new StringBuilder();
            for (int i = 0; i < selectindices.length; i++) {
                builder.append("     ").append(listItem[selectindices[i]]);
            }
            text.setText(builder.toString());
        }
    }

    public static void main(String[] args) {
        new JListDemo();
    }

}
