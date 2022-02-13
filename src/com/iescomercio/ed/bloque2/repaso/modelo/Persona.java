package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Incicalizamos las varaibles con los datos recibidos
	 * @param dni 
	 * @param nombre
	 * @param apellido1
	 * @author Eduardo
	 * 
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 *@return Devuelve el DNi de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Cambiamos el Dni de la persona pero antes comprobamos si tiene una letra al final y ni no la tiene lanza una excepccion
	 * @param dni Dni que vamos a comprobar
	 * @throws Exception Devulve la excecion cuando lo que se introduce no tiene una letra al final
	 */
	public void setDni(String dni) throws Exception{
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Devulve el nombre de la persona
	 * @return nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido1() {
		return apellido1;
	}
	
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
