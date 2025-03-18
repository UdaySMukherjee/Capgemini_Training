package loop;

import java.util.Scanner;

public class SumofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number: ");
		int start = sc.nextInt();
		System.out.print("Enter end number: ");
		int end = sc.nextInt();
		if (start>end) {
			int temp = start;
			start = end;
			end = temp;
			}
		int summ=0;
		for(;start<=end;start++)
			summ+= start;
		System.out.println(summ);
		sc.close();
		}
	}

