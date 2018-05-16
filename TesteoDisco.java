package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoDisco 
{
	@Test
	public void testPerimetroInterior() 
	{
		Disco nuevoDisco1 = new Disco(2.4,4.5);
		nuevoDisco1.perimetroInterior();
		Double esperado = 15.079644737231007;
		assertEquals(esperado, nuevoDisco1.perimetroInterior());
	}
	
	@Test
	public void testPerimetroExterior() 
	{
		Disco nuevoDisco2 = new Disco(1.2,4.5);
		nuevoDisco2.perimetroExterior();
		Double esperado = 28.274333882308138;
		assertEquals(esperado, nuevoDisco2.perimetroExterior());
	}
	
	@Test
	public void testSuperficieInterior()
	{
		Disco nuevoDisco3 = new Disco(1.5,3.5);
		nuevoDisco3.superficieInterior();
		Double esperado = 7.0685834705770345;
		assertEquals(esperado, nuevoDisco3.superficieInterior());
	}

	@Test
	public void testSuperficieExterior()
	{
		Disco nuevoDisco4 = new Disco(1.5,3.5);
		nuevoDisco4.superficieExterior();
		Double esperado = 38.48451000647496;
		assertEquals(esperado, nuevoDisco4.superficieExterior());
	}
	
	@Test
	public void testSuperficie()
	{
		Disco nuevoDisco5 = new Disco(1.5,3.5);
		nuevoDisco5.superficieInterior();
		nuevoDisco5.superficieExterior();
		Double esperado = 31.415926535897928;
		assertEquals(esperado, nuevoDisco5.superficie());
	}
}

