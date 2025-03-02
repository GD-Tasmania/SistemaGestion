package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class GestionEmpresa {
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	private ArrayList<Proyecto> listaProyectos = new ArrayList<>();
	private ArrayList<Gerente> listaGerentes = new ArrayList<>();
	private ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
	
	public GestionEmpresa() {
	}
	
	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}
	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	public ArrayList<Proyecto> getListaProyectos() {
		return listaProyectos;
	}
	public void setListaProyectos(ArrayList<Proyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}
	public ArrayList<Gerente> getListaGerentes() {
		return listaGerentes;
	}
	public void setListaGerentes(ArrayList<Gerente> listaGerentes) {
		this.listaGerentes = listaGerentes;
	}
	public ArrayList<Tecnico> getListaTecnicos() {
		return listaTecnicos;
	}
	public void setListaTecnicos(ArrayList<Tecnico> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}
	
	public void asociarDepartamentoProyecto(Departamento departamento, Proyecto proyecto) {
		departamento.setProyectoAsociado(proyecto);
		proyecto.getListaDepartamentos().add(departamento);
	}
	
	public void asociarDepartamentoGerente(Departamento departamento, Gerente gerente) {
		departamento.setGerenteAsociado(gerente);
		gerente.setDepartamentoAsociado(departamento);
	}
	
	public void asociarDepartamentoTecnico(Departamento departamento, Tecnico tecnico) {
		departamento.getListaTecnicos().add(tecnico);
		tecnico.setDepartamentoAsociado(departamento);
	}
	
	public void asociarProyectoEmpleado(Proyecto proyecto, Empleado empleado) {
		proyecto.getListaEmpleadosAsignados().add(empleado);
		empleado.setProyectoAsociado(proyecto);
	}
	
	public String buscarTecnicosNombreDepartamento(String nombre) {
		String resultado = "";
		for(Departamento departamento : this.listaDepartamentos) {
			if(departamento.getNombre().equalsIgnoreCase(nombre)) {
				for(Empleado tecnico : departamento.getListaTecnicos()) {
					resultado+=tecnico.toString();
				}
			}
		}
		return resultado;
	}
}
