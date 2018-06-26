
public class Test2 {
	public static void main(String []asd) {
		 int k = 2*5 - 2;
		  
	        // outer loop to handle number of rows
	        //  n in this case
	        for (int i=0; i<5; i++)
	        {
	 
	            // inner loop to handle number spaces
	            // values changing acc. to requirement
	            for (int j=0; j<k; j++)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	  
	            // decrementing k after each loop
	            k = k - 1;
	  
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop
	            for (int j=0; j<=i; j++ )
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	  
	            // ending line after each row
	            System.out.println();
	}
	    //  n in this case
	        for (int i=4; i>0; i--)
	        {
	 
	            // inner loop to handle number spaces
	            // values changing acc. to requirement
	            for (int j=0; j<k; j++)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	  
	            // decrementing k after each loop
	            k = k - 1;
	  
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop
	            for (int j=0; j<=i; j++ )
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	  
	            // ending line after each row
	            System.out.println();
	}}
	
}
