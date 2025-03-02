package co.edu.uniquindio.gestion;

import co.edu.uniquindio.gestion.factory.ModelFactory;
import co.edu.uniquindio.gestion.util.Constantes;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarTecnicosNombreDepartamento(modelFactory);
    }

	private static void buscarTecnicosNombreDepartamento(ModelFactory modelFactory) {
		String nombre = "Desarrollo de software";
		String resultado = modelFactory.buscarTecnicosNombreDepartamento(nombre);
		validarResultado(resultado, Constantes.EXISTE+resultado, Constantes.NO_EXISTE);
	}

	private static void validarResultado(String resultado, String mensajeExitoso, String mensajeNoExitoso) {
		if(!resultado.equals("")) {
			System.out.println(mensajeExitoso);
		} else {
			System.out.println(mensajeNoExitoso);
		}
		
	}
}