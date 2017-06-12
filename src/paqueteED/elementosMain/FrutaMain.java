package paqueteED.elementosMain;

import java.util.Scanner;

import paqueteED.elementosJava.Frutas;

/**
 * Esta clase creará objetos de tipo Fruta
 * y mostrará sus características por consola
 * @author Pilar
 * @version 1.0
 *
 */
public class FrutaMain {

	/**
	 * método main que se encarga de la ejecución 
	 * de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		Frutas objNaranja = new Frutas("Naranja", "Naranja", "Acido", 120);
		Frutas objManzana = new Frutas("Manzana");
		
		objManzana.setColor("Verde");
		objManzana.setSabor("Dulce");
		objManzana.setPeso(95);
		
		System.out.println("Tenemos dos objetos");
		System.out.println("El primero es una " + 
							objNaranja.getNombre());
		System.out.println("es de color " + 
							objNaranja.getColor());
		System.out.println("tiene un sabor " + 
							objNaranja.getSabor());
		System.out.println("tiene un peso de  " + 
							objNaranja.getPeso() + " gramos");
		System.out.println("El segundo es una " + 
							objManzana.getNombre());
		System.out.println("es de color " + 
							objManzana.getColor());
		System.out.println("tiene un sabor " + 
							objManzana.getSabor());
		System.out.println("tiene un peso de  " + 
							objManzana.getPeso() + " gramos");

	}

}
