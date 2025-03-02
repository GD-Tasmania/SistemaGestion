package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String codigo;
	private Proyecto proyectoAsociado;
	private Gerente gerenteAsociado;
	private ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
	
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

	public Proyecto getProyectoAsociado() {
		return proyectoAsociado;
	}
	public void setProyectoAsociado(Proyecto proyectoAsociado) {
		this.proyectoAsociado = proyectoAsociado;
	}

	public Gerente getGerenteAsociado() {
		return gerenteAsociado;
	}
	public void setGerenteAsociado(Gerente gerenteAsociado) {
		this.gerenteAsociado = gerenteAsociado;
	}

	public ArrayList<Tecnico> getListaTecnicos() {
		return listaTecnicos;
	}
	public void setListaTecnicos(ArrayList<Tecnico> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
}
