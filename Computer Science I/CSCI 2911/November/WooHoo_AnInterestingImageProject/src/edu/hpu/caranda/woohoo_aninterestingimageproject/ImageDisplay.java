package edu.hpu.caranda.woohoo_aninterestingimageproject;

import java.awt.image.BufferedImage;
import javax.swing.*;

/*********************************************************************
 * This is a simple class that displays an image.
 * It pops up a frame when you create an object. You can set the
 * image and it will appear in the frame.
 *********************************************************************/
public class ImageDisplay {
	
	private JLabel label;
	private JFrame frame;
	
	/*********************************************************************
	 * Create a new ImageDisplay.
	 * This pops up a window. The window will be tiny until you actually
	 * display an image with the setPicture() method.
	 *********************************************************************/
	public ImageDisplay() {
		
		/*****************************************************
		 * A label is a component that can display a short
		 * text string or an icon. We will use it to display
		 * an image
		 *****************************************************/
		label = new JLabel();
		
		/***********************************************************
		 * Create the frame. The frame is the component that shows
		 * up as a window on your desktop. It is basically just a
		 * container for other components, like the label.
		 * We tell the frame that we want too the program to quit
		 * when we close the window, then we add the label component
		 * to the frame, then we tell the frame to lay out the label
		 * inside the frame, and finally we make the frame appear on
		 * the screen.
		 ***********************************************************/
		frame = new JFrame("Image Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
		
	} // end of constructor
	
	
	/*****************************************************
	 * translate our image class into Java's kind of image
	 *****************************************************/
	public void showImage( int[][] pix ) {  // an array of pixels
		
		int height = pix.length;
		int width = pix[0].length;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		
		// Copy our image's data into the Java-style image *
		for(int j=0; j<height; ++j) {
			for(int i=0; i<width; ++i) {
                int r = pix[j][i]<<16;
                int g = pix[j][i]<<8;
                int b = pix[j][i];
				int rgb = r+g+b;;
				image.setRGB(i, j, rgb);
			}
		}
		
		// ready to display...
		label.setIcon(new ImageIcon(image));  // tell the label to display our image
		frame.pack();  // makes the frame resize itself to fit the image
		
	} // end of showImage method
	
	
} // end of ImageDisplay class
