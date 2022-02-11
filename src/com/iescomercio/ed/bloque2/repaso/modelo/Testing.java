package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	private Persona primero = new Persona("12345678M", "Manolito1","Ape1");	
	private Persona segundo = new Persona("1234567M", "Manolito2","Ape2");
	private String DNI = primero.getDni(); 
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testContructor() {
		
		assertEquals(primero, new Persona("12345678M", "Manolito","Apel"));
		assertNotEquals(primero, new Persona("12345678", "Manolito","Apel"));
		assertEquals(primero, new Persona("12345678M", "Mao","Apel"));
		assertEquals(primero, new Persona("12345678M", "Manolito","Al"));
	}
	
	@Test
	void testGetDni(){
		
		assertEquals(DNI, primero.getDni());
		assertNotEquals(DNI, "zxc");
		assertEquals(DNI,"12345678M");
		assertNotEquals(DNI,"1234578M");
	}
	
	@Test
	void testSetDNI() throws Exception {
		assertNotEquals(primero.getDni(), segundo.getDni());
		segundo.setDni("12345678M");
		assertEquals(primero.getDni(), segundo.getDni());
	}
	
	
	@Test
	void testGetNombre() {
		assertNotEquals(primero.getNombre(), segundo.getNombre());
		assertEquals(primero.getNombre(), "Manolito1");
		assertEquals("Manolito2", segundo.getNombre());
	}
	
}
