package co.edu.uniquindio.gestion.model;

public class Tecnico extends Empleado {
	private String especializacion;

	public Tecnico(String nombre, String codigo, String especializacion) {
		super(nombre, codigo);
		this.especializacion = especializacion;
	}

	public String getEspecializacion() {
		return especializacion;
	}
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
}
