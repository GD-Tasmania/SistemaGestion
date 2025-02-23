package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class GestionEmpresa {
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	private ArrayList<Departamento> listaProyectos = new ArrayList<>();
	private ArrayList<Departamento> listaGerentes = new ArrayList<>();
	private ArrayList<Departamento> listaTecnicos = new ArrayList<>();
	
	public GestionEmpresa() {
	}
	
	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}
	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	public ArrayList<Departamento> getListaProyectos() {
		return listaProyectos;
	}
	public void setListaProyectos(ArrayList<Departamento> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}
	public ArrayList<Departamento> getListaGerentes() {
		return listaGerentes;
	}
	public void setListaGerentes(ArrayList<Departamento> listaGerentes) {
		this.listaGerentes = listaGerentes;
	}
	public ArrayList<Departamento> getListaTecnicos() {
		return listaTecnicos;
	}
	public void setListaTecnicos(ArrayList<Departamento> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}
}
