package com.hacktoberfest;

import java.util.Scanner;
//Un programa que extrae todo el texto de una frase, excepto la primera y la �ltima palabra.
public class ExtraerPalabras2 {

	public static void main (String [] args) {
		Scanner lector = new Scanner(System.in);

		System.out.println ("Escribe una frase de texto y pulsa retorno:");
		String texto = lector.nextLine();
		// Busca el primer y el �ltimo espacio en blanco. 
		int inicioSubcadena = texto.indexOf(' ');
		int finSubcadena = texto.lastIndexOf(' ');

		System.out.println ("El texto sin la primera y la �ltima palabra es:");

		if(inicioSubcadena==finSubcadena){
			/*O bien no hay espacios (los dos m�todo eval�an a -1).
			  O bien s�lo hay dos palabras (los dos m�todos eval�an la misma posici�n).
			  No se muestra nada.*/

			System.out.println ("(No hay nada que escribir ...)");
		}else{
			/*Se muestra la cadena intermedia.
			  La segunda palabra empieza una posici�n tras el primer espacio en blanco.
			  La �ltima palabra comienza una posici�n despu�s del �ltimo espacio en blanco.*/

			String textoFinal = texto.substring(inicioSubcadena+1,finSubcadena);
			System.out.println(textoFinal);
		}
	lector.close();}
} 
