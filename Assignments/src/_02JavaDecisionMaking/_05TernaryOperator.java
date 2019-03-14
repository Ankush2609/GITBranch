package _02JavaDecisionMaking;

import java.util.Scanner;

public abstract class _05TernaryOperator {

	public static void main(String[] args) {
		
		int no1;
		int no2;
		int no3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. 1: ");
		no1 = sc.nextInt();
		
		System.out.println("Enter No. 2: ");
		no2 = sc.nextInt();
		
		no3 = no1 > no2 ? no1 : no2;
		
		System.out.println(no3);
		sc.close();
	}

}
