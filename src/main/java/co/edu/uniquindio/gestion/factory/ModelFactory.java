package co.edu.uniquindio.gestion.factory;

import co.edu.uniquindio.gestion.model.*;
import co.edu.uniquindio.gestion.model.GestionEmpresa;

public class ModelFactory {
	private static ModelFactory modelFactory;
	private GestionEmpresa gestionEmpresa;
	
	private ModelFactory() {
		inicializarDatos();
	}
	
	public static ModelFactory getInstance() {
		if(modelFactory == null) {
			modelFactory = new ModelFactory();
		}
		
		return modelFactory;
	}

	private void inicializarDatos() {
		gestionEmpresa = new GestionEmpresa();
		Departamento departamento1 = new Departamento("Desarrollo de software", "001");
		Departamento departamento2 = new Departamento("Analisi de datos", "002");
		Proyecto proyecto1 = new Proyecto("Crud de vehiculos", "011");
		Proyecto proyecto2 = new Proyecto("Crud de clientes", "011");
		Proyecto proyecto3 = new Proyecto("Analisis de clientes", "011");
		Gerente gerente1 = new Gerente("Rodolfo", "051");
		Gerente gerente2 = new Gerente("Alberto", "052");
		Tecnico tecnico1 = new Tecnico("Luis", "101", "Desarrollador de software");
		Tecnico tecnico2 = new Tecnico("Juan", "102", "Desarrollador de software");
		Tecnico tecnico3 = new Tecnico("Paco", "103", "Analista de datos");
		Tecnico tecnico4 = new Tecnico("Pepe", "104", "Analista de datos");
		Tecnico tecnico5 = new Tecnico("Lina", "105", "Desarrollador de software");
		
		
	}
}
