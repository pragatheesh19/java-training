import java.util.*;
public class Ebbill {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter units: ");
	    double units = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter type (normal / commercial): ");
	    String type = sc.nextLine();
	    int rate = 0;

	    if (type.equals("normal")) {
	        if (units <= 100) rate = 0;
	        else if (units <= 200) rate = 5;
	        else if (units <= 300) rate = 10;
	        else if (units <= 400) rate = 15;
	        else if (units <= 500) rate = 20;
	        else rate = 25;
	        }
	    else if (type.equals("commercial")) {
	         if (units <= 100) rate = 10;
	         else if (units <= 200) rate = 20;
	         else if (units <= 300) rate = 30;
	         else if (units <= 400) rate = 40;
	         else if (units <= 500) rate = 50;
	         else rate = 60;
	        }
	    else {
	        System.out.println("Invalid type");
	        return;
	        }
	     double total = units * rate;
	     System.out.println("\nBILL");
	     System.out.println("Type  : " + type);
	     System.out.println("Units : " + units);
	     System.out.println("Rate  : ₹" + rate + " per unit");
	     System.out.println("Total : ₹" + total);
	    }
	}

