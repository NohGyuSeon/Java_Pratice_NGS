package NGS.NHN.code.day03;

import java.util.Scanner;

public class Whatday {
	  static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  
	  public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			EnumMonth[] monthNames = EnumMonth.values();
			
			System.out.print("Enter year Number: ");
			int yearNum = sc.nextInt();
			
			System.out.print("Enter a day number between 1 and 365(366): ");
			String line = sc.next();
			int dayNum = Integer.parseInt(line);
			
			boolean isLeapYear = (yearNum % 4 == 0) && (yearNum % 100 != 0 || yearNum % 400 == 0);
			
			int MaxNum = isLeapYear ? 366:365;
			
			if (dayNum < 1 || dayNum > MaxNum) {
				throw new IllegalArgumentException("Out of date range");
			}
			
		    int monthNum = 0; 
		    
        	if (isLeapYear) {
                System.out.println("it's Leap Year");
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                    	
                        dayNum -= days;
                        monthNum++;
                    }
                }
            } else {
                System.out.println("it's Common Year");
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            }
        	
        	EnumMonth monthName = monthNames[monthNum];
        	
        	System.out.printf("%s, %d \n", monthName, dayNum);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
}
