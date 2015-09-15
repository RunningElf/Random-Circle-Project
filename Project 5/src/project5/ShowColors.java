package project5;
/*
 * Project 5 Description
Create an application that provides a solution for problem 13.6 by modifying the solution as follows.

Provide for starting the drawings at random location (i.e., the x-y coordinate must be calculated randomly).   
Random number generation is covered in section 6.9, pp. 213 - 218.
Provide a random color for each circle.  Color control is covered in section 13.3, pp.559 - 566.
Provide a random diameter for each circle (i.e., should not default to 20 pixels greater than previous as 
specified in the text). Shape Drawing is covered in section 13.5, specifically Fig. 13.18 & 13.19, pp. 571 - 575.
Notes:

Make all other necessary modifications necessary to run the application.  Zip all source code files and 
upload to the drop box.
 */
import javax.swing.JFrame;

public class ShowColors {

    //execute application
    public static void main(String[] args)
    {
        //create frame for ColorJPanel
        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
    
}//end class ShowColors

