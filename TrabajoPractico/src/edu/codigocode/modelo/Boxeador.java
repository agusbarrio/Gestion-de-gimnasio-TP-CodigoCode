package edu.codigocode.modelo;

public class Boxeador {

	private String nombre;
	private String apellido;
	private int edad;
	private double altura;
	private double peso;
	private String cat;
	private Entrenador entrenador;
	private int dieta;
	
	public Boxeador(String nombre, String apellido, int edad, double altura, double peso, String cat,
			Entrenador entrenador, int dieta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.cat = cat;
		this.entrenador = entrenador;
		this.dieta = dieta;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public String getCat() {
		return cat;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public int getDieta() {
		return dieta;
	}
}
