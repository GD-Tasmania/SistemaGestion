package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private String codigo;
	private Gerente empleadoGerente;
	private ArrayList<Empleado> listaEmpleadosProyecto = new ArrayList<>();
	
	public Proyecto(String nombre, String codigo) {
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

	public Gerente getEmpleadoGerente() {
		return empleadoGerente;
	}
	public void setEmpleadoGerente(Gerente empleadoGerente) {
		this.empleadoGerente = empleadoGerente;
	}

	public ArrayList<Empleado> getListaEmpleadosProyecto() {
		return listaEmpleadosProyecto;
	}
	public void setListaEmpleadosProyecto(ArrayList<Empleado> listaEmpleadosProyecto) {
		this.listaEmpleadosProyecto = listaEmpleadosProyecto;
	}
}
