package co.edu.uniquindio.gestion.model;

public class Tecnico extends Empleado {
	private String especializacion;
	private Departamento departamentoAsociado;

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

	public Departamento getDepartamentoAsociado() {
		return departamentoAsociado;
	}
	public void setDepartamentoAsociado(Departamento departamentoAsociado) {
		this.departamentoAsociado = departamentoAsociado;
	}

	@Override
	public String toString() {
		return "Tecnico [nombre=" + getNombre() + ", especializacion=" + especializacion + 
				", proyectoAsignado=" + getProyectoAsociado().getNombre() + "]\n";
	}

	@Override
	public String contribuir(String contribucion) {
		return "El tecnico "+ getNombre() + " realizo una tarea del proyecto " 
				+getProyectoAsociado().getNombre() + "\nNota: " + contribucion;
	}
}
