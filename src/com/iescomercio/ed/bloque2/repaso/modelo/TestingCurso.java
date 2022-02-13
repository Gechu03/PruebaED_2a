package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestingCurso {
	private Persona primero = new Persona("12345678M", "Manolito1","Ape1");	
	private Persona segundo = new Persona("12345679M", "Manolito2","Ape2");
	private Persona tercero = new Persona("12345674M", "Manolito3","Ape3");
	private List<Persona> listaAlumnos = new ArrayList<>();
	private Curso curso1;
	
	
	
	@Test
	void TestEliminarAlumno() throws Exception {
		listaAlumnos.add(primero);
		listaAlumnos.add(segundo);
		curso1 = new Curso(listaAlumnos);
		int aux = curso1.size();
		curso1.eliminarAlumno("12345679M");
		assertEquals(aux, curso1.size()+1);
		assertThrows(Exception.class, () -> {curso1.eliminarAlumno("1234569M");});
	}
	
	@Test
	void TestAniadirAlumno() {
		listaAlumnos.add(primero);
		listaAlumnos.add(segundo);
		curso1 = new Curso(listaAlumnos);
		int aux = curso1.size();
		curso1.aniadirAlumno(tercero);
		assertEquals(aux, curso1.size()-1);
	}
	
	@Test 
	void TestEstaRegistrado() {
		listaAlumnos.add(primero);
		listaAlumnos.add(segundo);
		curso1 = new Curso(listaAlumnos);
		assertTrue(curso1.estaRegistrado("12345678M")); 
		assertFalse(curso1.estaRegistrado("22345678M")); 
	}
	
	@Test
	void TestConstructorVacio() {
		curso1 = new Curso();
	}
}
