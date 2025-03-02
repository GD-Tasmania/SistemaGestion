package co.edu.uniquindio.gestion.services;

public interface IModelFactoryServices {
	String buscarTecnicosNombreDepartamento(String nombre);
	String buscarEmpleadosAsignadosProyectoNombre(String codigo);
	String buscarDepartamentosAsociadosNombreProyecto(String nombre);
	String cambiarDepartamentoEmpleado(String codigo);
}
