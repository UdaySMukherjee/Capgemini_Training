package conditional;

import java.util.Scanner;

public class Week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int week = sc.nextInt();
		
		switch(week) {
		case 1:System.out.print("Monday");break;
		case 2:System.out.print("Tuesday");break;
		case 3:System.out.print("Wednesday");break;
		case 4:System.out.print("Thursday");break;
		case 5:System.out.print("Friday");break;
		case 6:System.out.print("Saturday");break;
		case 7:System.out.print("Sunday");break;
		default:System.out.print("INVALID INPUT");break;
		}sc.close();
	}
}
