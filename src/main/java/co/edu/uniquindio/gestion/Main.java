package co.edu.uniquindio.gestion;

import co.edu.uniquindio.gestion.factory.ModelFactory;
import co.edu.uniquindio.gestion.util.Constantes;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarTecnicosNombreDepartamento(modelFactory);
        buscarEmpleadosAsignadosProyectoCodigo(modelFactory);
        cambiarDepartamentoGerenteCodigo(modelFactory);
        contribuir(modelFactory);
    }

	private static void buscarTecnicosNombreDepartamento(ModelFactory modelFactory) {
		String nombre = "Desarrollo de software";
		String resultado = modelFactory.buscarTecnicosNombreDepartamento(nombre);
		validarResultado(resultado, Constantes.EXISTE+resultado, Constantes.NO_EXISTE);
	}
	
	private static void buscarEmpleadosAsignadosProyectoCodigo(ModelFactory modelFactory) {
		String codigo = "012";
		String resultado = modelFactory.buscarEmpleadosAsignadosProyectoCodigo(codigo);
		validarResultado(resultado, Constantes.EXISTE+resultado, Constantes.NO_EXISTE);
	}
	
	private static void cambiarDepartamentoGerenteCodigo(ModelFactory modelFactory) {
		String codigoDepartamento = "001";
		String codigoGerente = "052";
		String resultado = modelFactory.cambiarDepartamentoGerenteCodigo(codigoDepartamento, codigoGerente);
		validarResultado(resultado, resultado, Constantes.NO_EXISTE);
	}
	
	private static void contribuir(ModelFactory modelFactory) {
		String codigoTecnico = "101";
		String notaContribucion1 = "Hice el metodo de agregar vehiculos";
		imprimirMensaje(modelFactory.contribuir(codigoTecnico, notaContribucion1));
		String codigoGerente = "052";
		String notaContribucion2 = "Realizar el metodo de eliminar vehiculos";
		imprimirMensaje(modelFactory.contribuir(codigoGerente, notaContribucion2));
	}

	private static void validarResultado(String resultado, String mensajeExitoso, String mensajeNoExitoso) {
		if(!resultado.equals("")) {
			System.out.println(mensajeExitoso);
		} else {
			System.out.println(mensajeNoExitoso);
		}
	}
	private static void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}