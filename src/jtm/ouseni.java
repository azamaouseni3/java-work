package jtm;
import java.util.Scanner;
public class ouseni {
	
    double number;  // A number read from the data file.
    double sum;     // The sum of all the numbers read so far.
    int count;      // The number of numbers that were read.
    sum = 0;
    count = 0;
    try {
    	Scanner object=new Scanner();
       while (true) { // Loop ends when an exception occurs.
           number = object.nextDouble();
           count++;  // This is skipped when the exception occurs
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
}





}

}
