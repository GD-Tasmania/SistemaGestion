package co.edu.uniquindio.gestion.model;

public class Gerente extends Empleado {
	private int cantidadProyectos;
	private Departamento departamentoAsociado;
	
	public Gerente(String nombre, String codigo) {
		super(nombre, codigo);
		this.cantidadProyectos = 0;
	}

	public int getCantidadProyectos() {
		return cantidadProyectos;
	}
	public void setCantidadProyectos(int cantidadProyectos) {
		this.cantidadProyectos = cantidadProyectos;
	}

	public Departamento getDepartamentoAsociado() {
		return departamentoAsociado;
	}
	public void setDepartamentoAsociado(Departamento departamentoAsociado) {
		this.departamentoAsociado = departamentoAsociado;
	}

	@Override
	public String toString() {
		return "Gerente [cantidadProyectos=" + cantidadProyectos + "]";
	}
}
