package co.edu.uniquindio.gestion.model;

import java.util.ArrayList;

public class GestionEmpresa {
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	private ArrayList<Proyecto> listaProyectos = new ArrayList<>();
	private ArrayList<Gerente> listaGerentes = new ArrayList<>();
	private ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
	private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

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
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	public void agregarGerente(Gerente gerente) {
		this.listaGerentes.add(gerente);
		this.listaEmpleados.add(gerente);
	}
	
	public void agregarTecnico(Tecnico tecnico) {
		this.listaTecnicos.add(tecnico);
		this.listaEmpleados.add(tecnico);
	}
	
	public Departamento buscarDepartamento(String codigo) {
		for(Departamento departamento : this.listaDepartamentos) {
			if(departamento.getCodigo().equalsIgnoreCase(codigo)) {
				return departamento;
			}
		}
		return null;
	}
	
	public Gerente buscarGerente(String codigo) {
		for(Gerente gerente : this.listaGerentes) {
			if(gerente.getCodigo().equalsIgnoreCase(codigo)) {
				return gerente;
			}
		}
		return null;
	}
	
	public Empleado buscarEmpleado(String codigo) {
		for(Empleado empleado : this.listaEmpleados) {
			if(empleado.getCodigo().equalsIgnoreCase(codigo)) {
				return empleado;
			}
		}
		return null;
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
	
	public String buscarEmpleadosAsignadosProyectoCodigo(String codigo) {
		String resultado = "";
		for(Proyecto proyecto : this.listaProyectos) {
			if(proyecto.getCodigo().equalsIgnoreCase(codigo)) {
				for(Empleado empleado : proyecto.getListaEmpleadosAsignados()) {
					resultado+=empleado.toString();
				}
			}
		}
		return resultado;
	}
	
	public String cambiarDepartamentoGerenteCodigo(String codigoDepartamento, String codigoGerente) {
		String resultado = "";
		Departamento departamento = buscarDepartamento(codigoDepartamento);
		if(departamento != null) {
			Gerente gerente = buscarGerente(codigoGerente);
			if(gerente != null) {
				departamento.setGerenteAsociado(gerente);
				gerente.setDepartamentoAsociado(departamento);
				resultado+="El gerente "+gerente.getNombre() + " se asoció al departamento de "+ departamento.getNombre();
			} else {
				resultado+="Gerente no encontrado";
			}
		} else {
			resultado+="Departamento no encontrado";
		}
		return resultado;
	}
	
	public String contribuir(String codigo, String contribucion) {
		String mensaje = "";
		Empleado empleado = buscarEmpleado(codigo);
		if(empleado != null) {
			mensaje+=empleado.contribuir(contribucion);
		}
		return mensaje;
	}
}
