package project5;

import java.awt.Graphics;
import java.security.SecureRandom;
import java.awt.Color;
import javax.swing.JPanel;
/*
 * Project 5 Description
Create an application that provides a solution for problem 13.6 by modifying the solution as follows.

Provide for starting the drawings at random location (i.e., the x-y coordinate must be calculated randomly).   
Random number generation is covered in section 6.9, pp. 213 - 218.
Provide a random color for each circle.  Color control is covered in section 13.3, pp.559 - 566.
Provide a random diameter for each circle (i.e., should not default to 20 pixels greater than previous as 
specified in the text). Shape Drawing is covered in section 13.5, specifically Fig. 13.18 & 13.19, pp. 571 - 575.
Notes:

Make all other necessary modifications necessary to run the application.  Zip all source code files and upload to the drop box.
 * 
 * 
 */
public class ColorJPanel extends JPanel
{
    
    /**
	 * 
	 */
	ColorJPanel()
	{
		
	}

	//draw rectangles and Strings in different colors
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        SecureRandom generateRandomNumb = new SecureRandom();
        int red, green, blue ; //used to store a random generated number for the colors
        int x, y; //used to store random generated number for x-y coordinate
        int radius;
        //generate the random numbers for the colors. There is a boundary of 0-255
        red = generateRandomNumb.nextInt(255);
        green = generateRandomNumb.nextInt(255);
        blue = generateRandomNumb.nextInt(255);
        
      do{
    	  //generate random number for radius of shape -less than height
    	  radius = generateRandomNumb.nextInt(this.getHeight());
       }while (radius > this.getWidth());//check to make sure the generated number will fit into the window provided

      //generate random numbers for x-y coordinates and make sure that they are fully within frame by subtracting object
        x = generateRandomNumb.nextInt(this.getWidth() - (radius));
        y = generateRandomNumb.nextInt(this.getHeight()- (radius));
                
        //set new drawing color using integers
        g.setColor(new Color(red, green, blue));
        g.fillOval(x, y, radius, radius);
      
        
     }
}//end class ColorJPanel
