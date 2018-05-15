/*
 * Aliza Huynh
 * GradeConverter.java
 * This program accepts a numeric grade as input and then 
 * convert it to either a level grade or an letter grade
 */

package gradeconverter;

/**
 *
 * @author alhuy9821
 */
import java.util.*;
public class GradeConverter {
    /**
     * @param args the command line arguments
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double type;         

	do
	{
	    System.out.println("MAIN MENU");
	    System.out.println("=========");
	    System.out.println("1. Convert to a Level grade");
	    System.out.println("2. Convert to a Letter grade");
	    System.out.println("3. Exit \n");
	    System.out.println("Please enter your selection: ");
	    type = sc.nextInt();
               
            //this error previously stated that if the user does not equal 1, it will convert the percentage
            //to a letter grade, as opposed to a level grade
            //previously (type !=1) percentageToAlpha();
            //currently (type ==1) percentageToLevel();
	    if (type==1) percentageToAlpha();  
	    if (type==2) percentageToLevel();
	}
        //this statement is either incomplete or incorrect
        //since there is nothing that follows the condition statement
        //therefore this does not allow the user to exit the program in the console
	while (type == 3);
    }

    // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {
	double grade;  
	String alphaGrade;
	String messageOut;

	System.out.println("Please enter the numeric grade: "); 
	grade = sc.nextInt();
        //instead of saying (grade > 50), it should say (grade < 50); as of right now,
        //being greater than 50 overrides all of the other if statements
        //previous: (grade > 50)
        //currently: (grade < 50)
	if (grade < 50) {
		alphaGrade = "F";
	}
        
        else if ((grade >= 50) && (grade <=52))
	{
		alphaGrade = "D-";
	}
        
        else if ((grade >= 53) && (grade <=56))
	{
		alphaGrade = "D";
	}
        
        else if ((grade >= 57) && (grade <=59))
	{
		alphaGrade = "D+";
	}
        
        else if ((grade >= 60) && (grade <=62))  
	{
		alphaGrade = "C-";
	}
        
        else if ((grade >= 63) && (grade <=66))
	{
		alphaGrade = "C";
	}
        
        else if ((grade >= 67) && (grade <=69))
	{
		alphaGrade = "C+";
	}
        
        else if ((grade >= 70) && (grade <=72))
	{
		alphaGrade = "B-";
	}
        
        else if ((grade >= 73) && (grade <=76))
	{
		alphaGrade = "B";
	}
        
        else if ((grade >= 77) && (grade <=79))
	{
		alphaGrade = "B+";
	}
        
        else if ((grade >= 80) && (grade <=84))
	{
		alphaGrade = "A-";
	}
        
        else if ((grade >= 85) && (grade <=89))
	{
		alphaGrade = "A";
	}
        
        else if ((grade >= 90) && (grade <=100))
	{
		alphaGrade = "A+";
	}
        
        else
        {
                alphaGrade = "Error - invalid mark, try again!";
	}
        //the display message in the final result does not provide the proper letter grade 
        //in correspondece to the grade (ie. 98 = F)
        //this was fixed in the first if statement
        //with the error of (grade > 50)
	messageOut=(grade + "% = " + alphaGrade);
	System.out.println(messageOut);
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()
    {
	int grade = 0;
       
	String levelGrade = " ";
	String messageOut;

	System.out.println("Please enter the numeric grade: ");
	grade = sc.nextInt();

	if (grade < 50) {
		levelGrade = "R";
	}
        
        else if ((grade >= 50) && (grade <=52))
	{
		levelGrade = "L1-";
	}
        
        else if ((grade >= 53) && (grade <=56))
	{
		levelGrade = "L1";
        }
        
        else if ((grade >= 57) && (grade <=59))
	{
		levelGrade = "L1+";
	}
        
        else if ((grade >= 60) && (grade <=62))
	{
		levelGrade = "L2-";
         
	}
        
        //this condition statement was missing >=
        else if ((grade >= 63) && (grade <=66))
	{
		levelGrade = "L2";
	}
        
        else if ((grade >= 67) && (grade <=69))
	{
		levelGrade = "L2+";
	}
        
        else if ((grade >= 70) && (grade <=72))
	{
		levelGrade = "L3-";
	}
        
        else if ((grade >= 73) && (grade <=76))
	{
		levelGrade = "L4";                   
	}
        
        else if ((grade >= 77) && (grade <=79))
	{ 
		levelGrade = "L3+";
	}
        
        else if ((grade >= 80) && (grade <=84))
	{
		levelGrade = "L4-";
	}
        
        else if ((grade >= 85) && (grade <=89))
	{
		levelGrade = "L4";
	}
        
        else if ((grade >= 90) && (grade <=100))   
	{
		levelGrade = "L4+";
	}
        
        else if (grade > 100){
		levelGrade = "Error - invalid mark, try again!";
	}
        //this final message does not output the level grade, instead only 
        //outputs the numerical (percentage grade)
        //previous: messageOut =(grade + "% = " + grade);
        //current: messageOut =(grade + "% = " + levelGrade);
	messageOut =(grade + "% = " + levelGrade);  
	System.out.println(messageOut);
     
    }
}
