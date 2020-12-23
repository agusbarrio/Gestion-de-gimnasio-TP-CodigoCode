package edu.codigocode.modelo;

public class Categoria{
	
	private String NombreCategoria;
	private double LimiteInferior;
	private double LimiteSuperior;
	
	public Categoria(String nombreCategoria, double limiteInferior, double limiteSuperior) {
		super();
		this.NombreCategoria = nombreCategoria;
		this.LimiteInferior = limiteInferior;
		this.LimiteSuperior = limiteSuperior;
	}
	

	public String getNombreCategoria() {
		return NombreCategoria;
	}

	public double getLimiteInferior() {
		return LimiteInferior;
	}

	public double getLimiteSuperior() {
		return LimiteSuperior;
	}

}

/*
	MOSCA,		//48.988 	50.802
	GALLO,		//52.163 	53.525
	PLUMA,		//55.338 	57.152
	LIGERO,		//58.967 	61.237
	WELTER,		//63.503 	66.678
	MEDIANO,	//69.853 	72.562
	MEDIOPESADO,//76.205 	79.378
	PESADO,		//91        Sin Límite
*/