package es.studium.cambiaAporHa;

import java.util.Scanner;

public class cambiaAporHa
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime una palabra");
		 String cadena = teclado.next();
		 cadena = cadena.replaceAll("a","ha"); 
		 System.out.println(cadena); 
		 teclado.close();
	}

}
