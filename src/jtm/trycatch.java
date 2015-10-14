package jtm;
import java.util.Scanner;
public class trycatch {
	
	public static void method()
	{
		 double number;  
		    double sum;     
		    int count;      
		    sum = 0;
		    count = 0;
		    try {
		    	Scanner input=new Scanner(System.in);
		       while (true) { 
		           number = input.nextDouble();
		           count++;  
		           sum += number;
		       }
		    }
		    catch ( IllegalArgumentException e ) {
		       // We expect this to occur when the end-of-file is encountered.
		       // We don't consider this to be an error, so there is nothing to do
		       // in this catch clause.  Just proceed with the rest of the program.
		    }
		    // At this point, we've read the entire file.
		    System.out.println();
		    System.out.println("Number of data values read: " + count);
		    System.out.println("The sum of the data values: " + sum);
		    if ( count == 0 )
		       System.out.println("Can't compute an average of 0 values.");
		    else
		       System.out.println("The average of the values:  " + (sum/count));
		 }
		
		       
		       
		 
	public static void methoda()
	{
		Scanner object=new Scanner(System.in);
		int a;
		int b=0;
		a=object.nextInt();
		try
		{
		 int c = a / b;   
		}
		catch (ArithmeticException e)
		{
		 System.out.println("Can't do that!");
		}
		
	}

	   public static void main(String[] args) 
	   {
		   
		   trycatch obj=new trycatch();
		   
		   obj.methoda();
	   }
	
}
