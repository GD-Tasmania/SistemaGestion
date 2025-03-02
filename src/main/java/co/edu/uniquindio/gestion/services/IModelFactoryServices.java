package co.edu.uniquindio.gestion.services;

public interface IModelFactoryServices {
	String buscarTecnicosNombreDepartamento(String nombre);
	String buscarEmpleadosAsignadosProyectoCodigo(String codigo);
	String cambiarDepartamentoGerenteCodigo(String codigoDepartamento, String codigoGerente);
}