package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	private Persona primero = new Persona("12345678M", "Manolito","Apel");	
	private Persona Segundo = new Persona("1234567M", "Manolito","Apel");
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
		assertNotEquals(primero.getDni(), Segundo.getDni());
		primero.setDni("12345678M");
		assertEquals(primero.getDni(), Segundo.getDni());
	}
	
	
	@Test
	void testGetNombre
	
}
