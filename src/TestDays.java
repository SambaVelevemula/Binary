import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TestDays {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Hi there...");
		System.out.println("Calculate your working hours...");
		System.out.print("Enter joining date :");
		Scanner sc=new Scanner(System.in);
		String date1=sc.next();
		System.out.println();
		
		try {
		Date d1=format.parse(date1);
		Date d2=new Date();
		
		long days=((d2.getTime()-d1.getTime()));
		System.out.print("Total Days worked :"+TimeUnit.DAYS.convert( days, TimeUnit.MILLISECONDS));
		
		sc.close();
		}catch(ParseException pe) {pe.printStackTrace();}
	}

}
