package com.ipartek.formacion.uf2216.presentacion;

import java.util.Scanner;
import java.util.TreeMap;

import com.ipartek.formacion.uf2216.entidades.Libro;

public class PresentacionConsola {

	private final static TreeMap<Long, Libro> libros = new TreeMap<>();
	
	public static void main(String[] args) {
		Scanner scanner;
		long ultimoId = 1L;
		boolean repetir;
		
		do {
			//Scanner sobre la entrada est�ndar
			scanner = new Scanner(System.in);
			
			//Introducci�n de t�tulo
			System.out.print("T�tulo: ");
			String titulo = scanner.nextLine();
			
			//Introducci�n de ISBN
			System.out.print("ISBN: ");
			String isbn = scanner.nextLine();
			
			//Introducci�n de n�mero de p�ginas
			System.out.print("N�mero de p�ginas: ");
			int numeroPaginas = scanner.nextInt();
			scanner.nextLine();
			
			//Introducci�n de formato
			System.out.print("Formato (digital o papel): ");
			boolean formato = scanner.nextLine().equals("digital");
			
			//Creaci�n de libro en base a los datos introducidos
			Libro libro = new Libro(ultimoId, titulo, isbn, numeroPaginas, formato);
			
			//A�adir el libro a la colecci�n de libros
			
			libros.put(ultimoId++, libro);
			
			//Mostrar todos los libros
			for (Libro libroExtraido : libros.values()) {
				System.out.println(libroExtraido);
			}
			
			//Preguntar si el usuario quiere introducir un nuevo registro
			System.out.print("�Desea introducir un nuevo registro? (S/n) ");
			repetir = !scanner.nextLine().equalsIgnoreCase("n");
		} while (repetir);
		
		System.out.println("Saliendo de la aplicaci�n. Gracias por usar esta aplicaci�n");
		
		scanner.close();
	}

}
