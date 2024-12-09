package Com.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class HelperClass {

	public static double square(double number) {
		double output = number * number;
		return output;
	}

	public static int calcAge(Date dob) {
		LocalDate birthday = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // Birth date
		LocalDate currentDate = LocalDate.now(); // Local date
		int age = Period.between(birthday, currentDate).getYears();
		return age;
	}

	/*
	 * public static void main(String[] args) throws ParseException {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.print("enter your birth date (yyyy-MM-dd) : "); String st =
	 * sc.nextLine(); Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(st);
	 * System.out.println("Age is : " + calcAge(dob)); }
	 */

}
