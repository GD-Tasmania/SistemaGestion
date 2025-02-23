package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String codigo;
	private ArrayList<Empleado> listaEmpleadosDepartamento = new ArrayList<>();
	
	public Departamento(String nombre, String codigo) {
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

	public ArrayList<Empleado> getListaEmpleadosDepartamento() {
		return listaEmpleadosDepartamento;
	}
	public void setListaEmpleadosDepartamento(ArrayList<Empleado> listaEmpleadosDepartamento) {
		this.listaEmpleadosDepartamento = listaEmpleadosDepartamento;
	}
}
