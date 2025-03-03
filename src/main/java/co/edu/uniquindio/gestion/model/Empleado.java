package co.edu.uniquindio.gestion.model;
import co.edu.uniquindio.gestion.services.IContribuyente;

public abstract class Empleado implements IContribuyente {
	private String nombre;
	private String codigo;
	private Proyecto proyectoAsociado;
	
	public Empleado(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Proyecto getProyectoAsociado() {
		return proyectoAsociado;
	}
	public void setProyectoAsociado(Proyecto proyectoAsociado) {
		this.proyectoAsociado = proyectoAsociado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", codigo=" + codigo + "]";
	}	
}
