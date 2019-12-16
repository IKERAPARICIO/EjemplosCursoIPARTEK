package com.ipartek.formacion.ejemploaccesodatosformacion.utilidades;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {

	private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	private static Scanner s = new Scanner(System.in);
	
	public static boolean dniValido(String dni) {
		int numero;
		char letra;
		char letraCalculada;
		
		letra = dni.charAt(8);
		
		// TODO Intentar mejorar los replaces m�ltiples
		numero = Integer.parseInt(dni.substring(0, 8).replace('X',  '0').replace('Y', '1').replace('Z', '2'));
		
		letraCalculada = LETRAS_DNI.charAt(numero % 23);
		
		return letraCalculada == letra;
	}

	public static int leerEntero(String mensaje) {
		
		int i = 0;
		
		boolean correcto = true;
		
		do {
			System.out.print(mensaje);
			
			try {
				correcto = true;
				
				i = Integer.parseInt(s.nextLine()); 
				
			} catch (NumberFormatException e) {
				correcto = false;
				
				System.out.println("El dato introducido no es un n�mero entero");
			}
		} while (!correcto);
		
		return i;
	}

	public static String leerLinea(String mensaje) {
		System.out.print(mensaje);
		return s.nextLine();
	}

	public static Date leerDate(String mensaje) {
		System.out.println(mensaje);
		
		// TODO: Comprobar que sea un d�a v�lido
		int dia = leerEntero("D�a: ");
		// TODO: Comprobar que sea un mes v�lido
		int mes = leerEntero("Mes (en n�mero): ");
		// TODO: Comprobar que sea un a�o v�lido
		int anyo = leerEntero("A�o (con cuatro d�gitos): ");
		
		Calendar fecha = Calendar.getInstance();
		
		fecha.set(anyo, mes, dia);
		
		return fecha.getTime();
	}

}
