package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Compruba si el DNi se encutra el curos y elimina alumno
	 * @param dni
	 * @throws Exception Saca la exccepcion si el DNi recibido no tiene la longitud adecuada
	 * 
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	public int size() {
		return listaAlumnos.size();
	}
	/**
	 * Busca el DNI de una persona y se esta se encuentra en el curso lo elimina
	 * @param dni Este el Dni con el que vamos a buscar a la persona
	 * @return Devulve verdadero si el usuario se a eliminado, false de lo contrario
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Constructor de curso que se incializa todo vacio
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	public Curso(List<Persona> aux) {
		listaAlumnos= aux;
	}
	
	/**
	 * Esta funcion devulve el numero de alimnos que tiene el curso
	 * @deprecated
	 * @return devolveria el numero de los alumnos
	 */
	
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
