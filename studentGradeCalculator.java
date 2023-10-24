//Student Grade Calculator

import java.io.*;

class studentInput
{
	int totalMarks, marks[], n;
	float avg;
	void get()
	{
		try
		{
			DataInputStream ds = new DataInputStream(System.in);
			System.out.println("\nEnter the no of subjects : ");
			n = Integer.parseInt(ds.readLine());

			marks = new int[n];
			totalMarks = 0;

			for(int i=0;i<n;i++)
			{
				System.out.print("Enter the marks in Subject "+ (i+1)+": ");
				marks[i] = Integer.parseInt(ds.readLine());
				totalMarks+=marks[i];
			}

		}
		catch(IOException e){}
	}

	void avgCal()
	{
		avg = ((float) totalMarks) / n ;
	}

	void disp()
	{
		if(avg>=90 && avg<=100)
			System.out.println("Grade -- O"); //Outstanding
		else if(avg>=80)
			System.out.println("Grade -- E"); //Excellent
		else if(avg>=70)
			System.out.println("Grade -- A"); //Very Good
		else if(avg>=60)
			System.out.println("Grade -- B"); //Good
		else if(avg>=50)
			System.out.println("Grade -- C"); //Satisfactory
		else if(avg>=40)
			System.out.println("Grade -- D"); //Poor
		else
			System.out.println("Grade -- F"); //Fail
	}
}

class studentGradeCalculator
{
	public static void main(String args[])
	{
		studentInput ob = new studentInput();
		ob.get();
		ob.avgCal();
		ob.disp();
	}
}