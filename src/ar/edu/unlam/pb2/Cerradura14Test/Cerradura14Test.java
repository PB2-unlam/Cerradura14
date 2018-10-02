package ar.edu.unlam.pb2.Cerradura14Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.Cerradura14.Cerradura14;

public class Cerradura14Test {

	@Test
	public void queUnaCerraduraNuevaEstaCerrada() {
		Cerradura14 nuevaCerraduraCerrada = new Cerradura14(123, 2);
		boolean estado = nuevaCerraduraCerrada.estadoCerradura();
		Assert.assertTrue(!estado);
	}
	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra() {
		Cerradura14 cerraduraAbierta = new Cerradura14(1234, 2);
		cerraduraAbierta.abrir(1234);
		boolean estado = cerraduraAbierta.estaAbierta();
		Assert.assertTrue(estado);
	}
	
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra() {
		Cerradura14 cerraduraCerrada = new Cerradura14(1234, 2);
		cerraduraCerrada.abrir(123);
		boolean estado = cerraduraCerrada.estaCerrada();
		Assert.assertTrue(estado);
	}

	@Test
	public void queDevuelvaIntentosFallidos() {
		Cerradura14 intentosFallidos = new Cerradura14(123, 3);
		intentosFallidos.abrir(12);
		intentosFallidos.abrir(12);
		intentosFallidos.abrir(123);
		intentosFallidos.abrir(12);
		intentosFallidos.abrir(12);
		intentosFallidos.abrir(12);
		intentosFallidos.abrir(12);
		Integer expected = 4;
		Integer fallidos = intentosFallidos.devolverAperturasFallidas();
		Assert.assertEquals(expected, fallidos);
	}
	
	@Test
	public void queDevuelvaIntentosExitosos() {
		Cerradura14 intentosExitosos = new Cerradura14(123, 2);
		intentosExitosos.abrir(3);
		intentosExitosos.abrir(123);
		intentosExitosos.abrir(123);
		intentosExitosos.abrir(3);
		intentosExitosos.abrir(123);
		Integer expected = 2;
		Integer estado = intentosExitosos.devolverAperturasExitosas();
		Assert.assertEquals(expected, estado);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
