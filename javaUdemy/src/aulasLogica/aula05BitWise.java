package aulasLogica;

import java.util.Scanner;

public class aula05BitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bis is true!");
		}else {
			System.out.println("6th bis is false");
		}
		
		sc.close();
	}

}
