package es.patrones.main;

import es.patrones.adapter.Gato;
import es.patrones.adapter.Perro;
import es.patrones.adapter.PerroAdapter;
import es.patrones.adapter.Vaca;
import es.patrones.bridge.Archivo;
import es.patrones.bridge.ArchivoCsv;
import es.patrones.bridge.ArchivoPdf;
import es.patrones.bridge.ManejadorCsv;
import es.patrones.bridge.ManejadorPdf;
import es.patrones.composite.Rango;
import es.patrones.composite.Sargento;
import es.patrones.composite.Soldado;
import es.patrones.decorator.Humano;
import es.patrones.decorator.Mortal;
import es.patrones.decorator.SuperpoderRayos;
import es.patrones.decorator.SuperpoderVuelo;
import es.patrones.facade.OperacionesMalignas;
import es.patrones.flyweight.FlyweightFactoria;
import es.patrones.flyweight.FlyweightObjeto;
import es.patrones.proxy.Peticion;
import es.patrones.proxy.Proxy;

public class PatronesEstructurales {

	public static void main(String[] args) {
		ejecutarPatronAdapter();
		ejecutarPatronBridge();
		ejecutarPatronComposite();
		ejecutarPatronDecorator();
		ejecutarPatronFacade();
		ejecutarPatronFlyweight();
		ejecutarPatronProxy();
	}
	
	/**
	 * Prueba del patrón estructural Adapter.
	 */
	private static void ejecutarPatronAdapter() {
		System.out.println("[INICIO PATRÓN ADAPTER]");
		final Vaca vaca = new Vaca();
		final Gato gato = new Gato();
		final PerroAdapter adapter = new PerroAdapter(new Perro());
		vaca.hacerSonido();
		gato.hacerSonido();
		adapter.hacerSonido();
		System.out.println("[FIN PATRÓN ADAPTER]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Bridge.
	 */
	private static void ejecutarPatronBridge() {
		System.out.println("[INICIO PATRÓN BRIDGE]");
		final Archivo pdf = new ManejadorPdf(new ArchivoPdf());
        pdf.processFile();
        final Archivo csv = new ManejadorCsv(new ArchivoCsv());
        csv.processFile();
		System.out.println("[FIN PATRÓN BRIDGE]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Composite.
	 */
	private static void ejecutarPatronComposite() {
		System.out.println("[INICIO PATRÓN COMPOSITE]");
		final Rango soldado = new Soldado();
		final Rango soldado2 = new Soldado();
		final Rango sargento = new Sargento();
		((Sargento) sargento).agregarSubordinado(soldado);
		((Sargento) sargento).agregarSubordinado(soldado2);
		soldado.presentarse();
		soldado2.presentarse();
		sargento.presentarse();
		System.out.println("[FIN PATRÓN COMPOSITE]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Decorator.
	 */
	private static void ejecutarPatronDecorator() {
		System.out.println("[INICIO PATRÓN DECORATOR]");
		System.out.println("Paco antes de tener superpoderes:");
		Mortal paco = new Humano();
		paco.actuar();

        System.out.println("Tras convertir a Paco en un superhéroe con dos poderes:");

        paco = new SuperpoderVuelo(paco);
        paco = new SuperpoderRayos(paco);
        paco.actuar();
		System.out.println("[FIN PATRÓN DECORATOR]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Facade.
	 */
	private static void ejecutarPatronFacade() {
		System.out.println("[INICIO PATRÓN FACADE]");
		final OperacionesMalignas operacionesMalignas = new OperacionesMalignas();
		operacionesMalignas.aplicarMalignidadAbsoluta();
		System.out.println("[FIN PATRÓN FACADE]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Flyweight.
	 */
	private static void ejecutarPatronFlyweight() {
		System.out.println("[INICIO PATRÓN FLYWEIGHT]");
		FlyweightFactoria factoria = new FlyweightFactoria();

        FlyweightObjeto flyweight1 = factoria.getFlyweight("objeto1");
        FlyweightObjeto flyweight2 = factoria.getFlyweight("objeto2");
        FlyweightObjeto flyweight3 = factoria.getFlyweight("objeto1");

        System.out.println("Número de objetos Flyweight: " + factoria.getFlyweightCount());
        
        System.out.println("Datos de flyweight1: " + flyweight1.getData());
        System.out.println("Datos de flyweight2: " + flyweight2.getData());
        System.out.println("Datos de flyweight3: " + flyweight3.getData()); 
		System.out.println("[FIN PATRÓN FLYWEIGHT]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón estructural Proxy.
	 */
	private static void ejecutarPatronProxy() {
		System.out.println("[INICIO PATRÓN PROXY]");
		final Peticion proxy = new Proxy();
        proxy.pedir();
		System.out.println("[FIN PATRÓN PROXY]");
		System.out.println("\r\n");
	}

}
