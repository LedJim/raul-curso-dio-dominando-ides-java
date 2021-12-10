package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite el primer número: ");
		num1 = scan.nextInt();
		System.out.println("Digite el segundo número: ");
		num2 = scan.nextInt();
		
		int soma = soma(num1,num2);
		int resta = resta(num1,num2);
		int mult = mult(num1,num2);
		float div = div(num1,num2);
		
		double div_dob = div_dob(num1,num2);
		
		System.out.println("suma " + soma);
		System.out.println("resta " + resta);
		System.out.println("mult " + mult);
		System.out.println("div " + div);
		System.out.print("div " + div_dob);
		System.out.println("div doble " + div_dob);
		System.out.print("div doble " + div_dob);
		
		
		
		
	}

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int resta(int num1, int num2) {
		return num1 - num2;
	}
	
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	
	public static float div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static double div_dob(int num1, int num2) {
		return num1 / num2;
	}
	
	
	
}
