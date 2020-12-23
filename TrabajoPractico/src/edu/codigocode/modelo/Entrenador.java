package edu.codigocode.modelo;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
	
	private String nombre;
	private String cate1;
	private String cate2;
	private List<Boxeador> alumnos = new ArrayList<Boxeador>();
	

	public Entrenador(String nombre, String cate1, String cate2, List<Boxeador> alumnos) {
		super();
		this.nombre = nombre;
		this.cate1 = cate1;
		this.cate2 = cate2;
		this.alumnos = alumnos;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCate1() {
		return cate1;
	}


	public String getCate2() {
		return cate2;
	}


	public List<Boxeador> getAlumnos() {
		return alumnos;
	}

	
	
	
}
