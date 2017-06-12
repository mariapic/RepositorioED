package paqueteED.elementosJava;

/**
 * La clase Fruta es una clase patr�n
 * no va a tener m�todo main
 * tendr� 4 atributos o caracter�sticas
 * @author Pilar y Javier 
 * @version 1.0
 *
 */
public class Frutas {
	private String name;
	private String color;
	private String sabor;
	private int peso; // el peso ser� en gramos
	
	/**
	 * Constructor por defecto
	 */
	public Frutas() {}
	
	
	/**
	 * 
	 * @param nombre
	 */
	public Frutas(String nombre) {
		this.name = nombre;
	}


	/**
	 * @param name
	 * @param color
	 * @param sabor
	 * @param peso
	 */
	public Frutas(String name, String color, String sabor, int peso) {
		this.name = name;
		this.color = color;
		this.sabor = sabor;
		this.peso = peso;
	}
	
	/**
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return name;
	}
	
}
