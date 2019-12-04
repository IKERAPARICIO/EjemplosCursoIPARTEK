package com.ipartek.formacion.poo;

public class Persona {
	//CONSTANTES
	protected static final String APELLIDOS_POR_DEFECTO = "AN�NIMEZ";
	protected static final String NOMBRE_POR_DEFECTO = "AN�NIMO";

	/**
	 * Formato con corchetes
	 */
	public static final boolean CON_FORMATO = true;
	/**
	 * Formato s�lo con espacio
	 */
	public static final boolean SIN_FORMATO = false;
	
	//VARIABLES DE INSTANCIA
	private String nombre;
	private String apellidos;
	
	//CONSTRUCTORES
	public Persona(String nombre, String apellidos) {
		setNombre(nombre);
		setApellidos(apellidos);
	}
	
	public Persona() {
		this(NOMBRE_POR_DEFECTO, APELLIDOS_POR_DEFECTO);
	}

	//GETTERS Y SETTERS
	/**
	 * M�todo que devuelve el nombre almacenado
	 * @return valor del nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * M�todo que modifica el nombre almacenado
	 * @param nombre El nombre que va a sustituir el nombre almacenado
	 */
	public void setNombre(String nombre) {
		if(nombre == null) {
			throw new RuntimeException("No se acepta un nombre nulo");
		}
		
		if(nombre.trim().length() == 0) {
			throw new RuntimeException("No se aceptan nombres vac�os");
		}
		this.nombre = nombre.trim();
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		if(apellidos == null) {
			throw new RuntimeException("No se aceptan apellidos nulos");
		}
		
		this.apellidos = apellidos.trim();
	}
	
	//EJEMPLO DE SOBRECARGAS DE M�TODOS
	public String getNombreCompleto() {
		return getNombre() + " " + getApellidos();
	}
	
	/**
	 * M�todo que muestra el nombre completo en un formato determinado
	 * @param conFormato <code>true</code> para formato corchete y <code>false</code> para formato espacio
	 * @return Texto formateado como corresponda
	 */
	public String getNombreCompleto(boolean conFormato) {
		if (conFormato) {
			return "[" + getNombre() + ", " + getApellidos() + "]";
		} else {
			return getNombreCompleto();
		}
	}
	
	//M�TODO EST�TICO
	public static String getNombreCompletoPorDefecto() {
		return NOMBRE_POR_DEFECTO + " " + APELLIDOS_POR_DEFECTO;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
