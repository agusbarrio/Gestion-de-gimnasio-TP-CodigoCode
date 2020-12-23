package edu.codigocode.controlador;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.codigocode.modelo.Boxeador;
import edu.codigocode.modelo.Categoria;
import edu.codigocode.modelo.Entrenador;
public class GymController {
	
	List<Categoria> ListaCategorias = new ArrayList<Categoria>();
	List<Entrenador> ListaEntrenadores = new ArrayList<Entrenador>();
	List<Boxeador> ListaBoxeadores = new ArrayList<Boxeador>();
	
	public void GenerarCategoriasYEntrenadores() {
		//(Nombre, LimiteInferior, LimiteSuperior)
		Categoria Mosca = new Categoria("Mosca", 48.988, 50.802);
		Categoria Gallo = new Categoria("Gallo", 52.163, 53.525);
		Categoria Pluma = new Categoria("Pluma", 55.338, 57.152);
		Categoria Ligero = new Categoria("Ligero", 58.967, 61.237);
		Categoria Welter = new Categoria("Welter",  63.503, 66.678);
		Categoria Mediano = new Categoria("Mediano", 69.853, 72.562);
		Categoria Mediopesado = new Categoria("Mediopesado", 76.205, 79.378);
		Categoria Pesado = new Categoria("Pesado", 91, 9999999);
		
		ListaCategorias.add(Mosca);
		ListaCategorias.add(Gallo);
		ListaCategorias.add(Pluma);
		ListaCategorias.add(Ligero);
		ListaCategorias.add(Welter);
		ListaCategorias.add(Mediano);
		ListaCategorias.add(Mediopesado);
		ListaCategorias.add(Pesado);
		
		ListaEntrenadores.add(new Entrenador("Juan", "Mosca", "Gallo", new ArrayList<Boxeador>()));
		ListaEntrenadores.add(new Entrenador("Pedro", "Pluma", "Ligero", new ArrayList<Boxeador>()));
		ListaEntrenadores.add(new Entrenador("Jorge", "Welter", "Mediano", new ArrayList<Boxeador>()));
		ListaEntrenadores.add(new Entrenador("Daniel", "Mediopesado", "Pesado", new ArrayList<Boxeador>()));
		}
	
	public void IngresarBoxeador() {
		boolean salir = false;
	
		while(!salir) {
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Ingrese los datos del boxeador");
			System.out.println("---------------------------------------------------------------------------------");
	
			Scanner input = new Scanner(System.in);
			System.out.println("Nombre: ");
			String nombre = input.nextLine();
			System.out.println("Apellido: ");
			String apellido = input.nextLine();
			System.out.println("Edad: ");
			int edad = input.nextInt();
			System.out.println("Altura en metros: ");
			double altura = input.nextDouble();
			System.out.println("Peso en kilogramos:");
			double peso = input.nextDouble();		
			String cat = "";
			Entrenador entrenador = null;
			int dieta = 0;
			
			// dieta = 1 --> Debe engordar		dieta = 2 --> Debe perder peso entrenando
			
			// Definir categoria
			if (peso < ListaCategorias.get(0).getLimiteInferior()) {
			cat = ListaCategorias.get(0).getNombreCategoria();
			dieta = 1;
				} else  {
					for (int i = 0; i < ListaCategorias.size(); i++)	{
						if ((peso <= ListaCategorias.get(i).getLimiteSuperior()) && (peso >= ListaCategorias.get(i).getLimiteInferior())) {
							cat = ListaCategorias.get(i).getNombreCategoria();
						} else if((peso > ListaCategorias.get(i).getLimiteSuperior()) && peso < ListaCategorias.get(i+1).getLimiteInferior()) { 
							cat = ListaCategorias.get(i).getNombreCategoria();
							dieta = 2;				
						}
					}
				}
			
			// Asignar entrenador y crear ficha de boxeador
			for (int i = 0; i < ListaEntrenadores.size(); i++) {
					if (cat == ListaEntrenadores.get(i).getCate1() || cat == ListaEntrenadores.get(i).getCate2()) {
						if(ListaEntrenadores.get(i).getAlumnos().size() < 5) {
							entrenador = ListaEntrenadores.get(i);
							ListaEntrenadores.get(i).getAlumnos().add(new Boxeador(nombre, apellido, edad, altura, peso, cat, entrenador, dieta));
							ListaBoxeadores.add(new Boxeador(nombre, apellido, edad, altura, peso, cat, entrenador, dieta));
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println("Boxeador ingresado");
						} else {
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("Ingreso rechazado. Los cupos para el entrenador de esta categoria estan completos");
					}
				}
			}
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Ingrese 0 para finalizar el ingreso de boxeadores por hoy");
			System.out.println("Ingrese 1 para ingresar un boxeador al sistema");
			int salida = input.nextInt();
			if (salida == 0) {
				salir = true;
			}
		}
	}
	public void CantBoxeadores() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Cantidad de boxeadores ingresados el dia de hoy = " + ListaBoxeadores.size());
	}
	
	public void FichasEntrenadores() {
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¿Desea ver todas las fichas de los entrenadores?");
		System.out.println("Si no desea verlas ingrese 0");
		System.out.println("Para verlas ingrese 1");
		int salida = input.nextInt();
		if (!(salida == 0)) {
			for(int i = 0 ; i < ListaEntrenadores.size() ; i++) {
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Entrenador: " + ListaEntrenadores.get(i).getNombre());
				System.out.println("Cantidad de boxeadores: " + ListaEntrenadores.get(i).getAlumnos().size());
				System.out.println("Categorias: " + ListaEntrenadores.get(i).getCate1() + " y " + ListaEntrenadores.get(i).getCate2());
				System.out.println("");
			}
		}
	}
	
	public void FichasBoxeadores() {
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¿Desea ver todas las fichas de los boxeadores?");
		System.out.println("Si no desea verlas ingrese 0");
		System.out.println("Para verlas ingrese 1");
		int salida = input.nextInt();
		if (!(salida == 0)) {
			for (int i = 0; i < ListaBoxeadores.size(); i++) {
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Nombre: " + ListaBoxeadores.get(i).getNombre());
				System.out.println("Apellido: " + ListaBoxeadores.get(i).getApellido());
				System.out.println("Edad: " + ListaBoxeadores.get(i).getEdad() + " años");
				System.out.println("Altura: " + ListaBoxeadores.get(i).getAltura() + " m");
				System.out.println("Peso: " + ListaBoxeadores.get(i).getPeso() + " kg");
				System.out.println("Categoria: " + ListaBoxeadores.get(i).getCat());
				System.out.println("Entrenador: " + ListaBoxeadores.get(i).getEntrenador().getNombre());
				if (ListaBoxeadores.get(i).getDieta()==1) {
					System.out.println("Le corresponde dieta para engordar");
				}
				if (ListaBoxeadores.get(i).getDieta()==2) {
					System.out.println("Se espera que baje de peso con el entrenamiento");
				}
			}
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Vuelva pronto!");
	}
	
}		

	
