package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private String codigo;
	private ArrayList<Empleado> listaEmpleadosAsignados = new ArrayList<>();
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	
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

	public ArrayList<Empleado> getListaEmpleadosAsignados() {
		return listaEmpleadosAsignados;
	}
	public void setListaEmpleadosAsignados(ArrayList<Empleado> listaEmpleadosAsignados) {
		this.listaEmpleadosAsignados = listaEmpleadosAsignados;
	}

	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}
	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	@Override
	public String toString() {
		return "Proyecto [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
}
