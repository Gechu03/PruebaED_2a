package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	private Persona modelo = new Persona("12345678M", "Manolito","Apel");	
	private String DNI = modelo.getDni(); 
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testContructor() {
		
		assertEquals(modelo, new Persona("12345678M", "Manolito","Apel"));
		assertNotEquals(modelo, new Persona("12345678", "Manolito","Apel"));
		assertEquals(modelo, new Persona("12345678M", "Mao","Apel"));
		assertEquals(modelo, new Persona("12345678M", "Manolito","Al"));
	}
	
	@Test
	void testGetDni(){
		Persona cambia = new Persona("12345678M", "Manolito","Apel");
		assertEquals(DNI, cambia.getDni());
		assertNotEquals(DNI, "zxc");
		assertEquals(DNI,"12345678M");
		assertNotEquals(DNI,"1234578M");
	}
	
	@Test
	void testSetDNI() throws Exception {
		modelo.setDni("1234566M");
		assertNotEquals(modelo.getDni(), DNI);
		modelo.setDni("12345678M");
		assertEquals(modelo.getDni(), DNI);
		
		
	}
}
