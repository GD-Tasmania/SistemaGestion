package co.edu.uniquindio.gestion.factory;

import co.edu.uniquindio.gestion.model.*;
import co.edu.uniquindio.gestion.model.GestionEmpresa;
import co.edu.uniquindio.gestion.services.*;

public class ModelFactory implements IModelFactoryServices, IEmpleados {
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

	@Override
	public String buscarTecnicosNombreDepartamento(String nombre) {
		return gestionEmpresa.buscarTecnicosNombreDepartamento(nombre);
	}

	@Override
	public String buscarEmpleadosAsignadosProyectoCodigo(String codigo) {
		return gestionEmpresa.buscarEmpleadosAsignadosProyectoCodigo(codigo);
	}

	@Override
	public String cambiarDepartamentoGerenteCodigo(String codigoDepartamento, String codigoGerente) {
		return gestionEmpresa.cambiarDepartamentoGerenteCodigo(codigoDepartamento, codigoGerente);
	}
	
	public String contribuir(String codigo, String contribucion) {
		return gestionEmpresa.contribuir(codigo, contribucion);
	}
	
	private void inicializarDatos() {
		gestionEmpresa = new GestionEmpresa();
		Departamento departamento1 = new Departamento("Desarrollo de software", "001");
		Departamento departamento2 = new Departamento("Analisis de datos", "002");
		Proyecto proyecto1 = new Proyecto("Crud de vehiculos", "011");
		Proyecto proyecto2 = new Proyecto("Analisis de clientes", "012");
		Gerente gerente1 = new Gerente("Rodolfo", "051");
		Gerente gerente2 = new Gerente("Alberto", "052");
		Tecnico tecnico1 = new Tecnico("Luis", "101", "Desarrollador de software");
		Tecnico tecnico2 = new Tecnico("Juan", "102", "Desarrollador de software");
		Tecnico tecnico3 = new Tecnico("Paco", "103", "Analista de datos");
		Tecnico tecnico4 = new Tecnico("Pepe", "104", "Analista de datos");
		Tecnico tecnico5 = new Tecnico("Lina", "105", "Desarrollador de software");
		gestionEmpresa.asociarDepartamentoProyecto(departamento1, proyecto1);
		gestionEmpresa.asociarDepartamentoGerente(departamento1, gerente1);
		gestionEmpresa.asociarDepartamentoTecnico(departamento1, tecnico1);
		gestionEmpresa.asociarDepartamentoTecnico(departamento1, tecnico2);
		gestionEmpresa.asociarDepartamentoTecnico(departamento1, tecnico5);
		gestionEmpresa.asociarProyectoEmpleado(proyecto1, gerente1);
		gestionEmpresa.asociarProyectoEmpleado(proyecto1, tecnico1);
		gestionEmpresa.asociarProyectoEmpleado(proyecto1, tecnico2);
		gestionEmpresa.asociarProyectoEmpleado(proyecto1, tecnico5);
		gestionEmpresa.asociarDepartamentoProyecto(departamento2, proyecto2);
		gestionEmpresa.asociarDepartamentoGerente(departamento2, gerente2);
		gestionEmpresa.asociarDepartamentoTecnico(departamento2, tecnico3);
		gestionEmpresa.asociarDepartamentoTecnico(departamento2, tecnico4);
		gestionEmpresa.asociarProyectoEmpleado(proyecto1, gerente2);
		gestionEmpresa.asociarProyectoEmpleado(proyecto2, tecnico3);
		gestionEmpresa.asociarProyectoEmpleado(proyecto2, tecnico4);
		gestionEmpresa.getListaDepartamentos().add(departamento1);
		gestionEmpresa.getListaDepartamentos().add(departamento2);
		gestionEmpresa.getListaProyectos().add(proyecto1);
		gestionEmpresa.getListaProyectos().add(proyecto2);
		gestionEmpresa.agregarGerente(gerente1);
		gestionEmpresa.agregarGerente(gerente2);
		gestionEmpresa.agregarTecnico(tecnico1);
		gestionEmpresa.agregarTecnico(tecnico2);
		gestionEmpresa.agregarTecnico(tecnico3);
		gestionEmpresa.agregarTecnico(tecnico4);
		gestionEmpresa.agregarTecnico(tecnico5);
	}
}
