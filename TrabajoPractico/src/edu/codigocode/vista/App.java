package edu.codigocode.vista;

import edu.codigocode.controlador.GymController;
import edu.codigocode.modelo.Boxeador;

public class App {

	public static void main(String[] args) {
		
		GymController gc = new GymController();	
		gc.GenerarCategoriasYEntrenadores();
		gc.IngresarBoxeador();
		gc.CantBoxeadores();
		gc.FichasEntrenadores();
		gc.FichasBoxeadores();
		
	}
	
}
