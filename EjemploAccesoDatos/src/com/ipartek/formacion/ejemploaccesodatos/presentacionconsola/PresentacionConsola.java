package com.ipartek.formacion.ejemploaccesodatos.presentacionconsola;

import com.ipartek.formacion.ejemploaccesodatos.accesodatos.Crudable;
import com.ipartek.formacion.ejemploaccesodatos.accesodatos.PersonaMemoria;
import com.ipartek.formacion.ejemploaccesodatos.entidades.Persona;

public class PresentacionConsola {

	public static void main(String[] args) {
		//DAO: Data Access Object
		Crudable<Persona> dao = PersonaMemoria.getInstancia();
		
		System.out.println(dao.insert(new Persona(3L, "Nuevo", "Nuevez")));
		
		for(Persona persona: dao.getAll()) {
			System.out.println(persona);
		}
		
		// TODO Men� con opciones num�ricas (1. Listado, 2. Crear ... 0. Salir)
		// TODO Exportaci�n/Importaci�n Excel
		// TODO Guardar/Cargar
	}

}
