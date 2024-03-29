package aulasLogica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aula03Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//min retorna o  menor valor.
		/*
		int n = Math.min(15, 5);
		System.out.println(n);*/
		
		/*
		int res,n1,n2; //max retorna o maior numero.
		n1 = 10;
		n2 = 13;
		res = Math.max(n1, n2);
		
		System.out.println(res);
		*/
		//sqrt retorna a raiz quadrada.
		/*
		double res,n1,n2;
		n1 = 64;
		n2 = 91;
		res = Math.sqrt(n2);
		
		System.out.println(res);*/
		//abs retorna o valor absoluto valor pasado valor negativo continua positivo.
		/* 
		double res,n1,n2;
		n1 = -64;
		n2 = 91;
		res = Math.abs(n1);
		
		System.out.println(res);
		*/
		// random retorn valores aleatorio.
		/*
		int res,n1,n2;
		n1 = -64;
		n2 = 91;
		
		for(int i=0; i<10; i++) {
			res = (int)(Math.random()*101);
			System.out.println(res);
		}
		*/
		int x = 3;
		while(x < 5) {
			int y = x * 3;
			System.out.println(y);
			x = x + 1;
		}
		System.out.println("FIM");
		
	}

}
