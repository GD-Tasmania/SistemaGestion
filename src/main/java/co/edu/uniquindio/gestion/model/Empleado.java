package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private String codigo;
	private Departamento departamentoAsignado;
	private Proyecto proyectoPrincipal;
	private ArrayList<Proyecto> listaProyectosAsignados = new ArrayList<>();
	
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

	public Departamento getDepartamentoAsignado() {
		return departamentoAsignado;
	}
	public void setDepartamentoAsignado(Departamento departamentoAsignado) {
		this.departamentoAsignado = departamentoAsignado;
	}

	public Proyecto getProyectoPrincipal() {
		return proyectoPrincipal;
	}
	public void setProyectoPrincipal(Proyecto proyectoPrincipal) {
		this.proyectoPrincipal = proyectoPrincipal;
	}

	public ArrayList<Proyecto> getListaProyectosAsignados() {
		return listaProyectosAsignados;
	}
	public void setListaProyectosAsignados(ArrayList<Proyecto> listaProyectosAsignados) {
		this.listaProyectosAsignados = listaProyectosAsignados;
	}
}
