package com.nj.terapias.model;


public class TriajeModel {

	private int id;
	private String nombrepaciente;
	private String apellidopaciente;
	private String responsablenombre;
	private String responsableapellido;
	private String telefonofijo;
	private String telefonocelular;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrepaciente() {
		return nombrepaciente;
	}

	public void setNombrepaciente(String nombrepaciente) {
		this.nombrepaciente = nombrepaciente;
	}

	public String getApellidopaciente() {
		return apellidopaciente;
	}

	public void setApellidopaciente(String apellidopaciente) {
		this.apellidopaciente = apellidopaciente;
	}

	public String getResponsablenombre() {
		return responsablenombre;
	}

	public void setResponsablenombre(String responsablenombre) {
		this.responsablenombre = responsablenombre;
	}

	public String getResponsableapellido() {
		return responsableapellido;
	}

	public void setResponsableapellido(String responsableapellido) {
		this.responsableapellido = responsableapellido;
	}

	public String getTelefonofijo() {
		return telefonofijo;
	}

	public void setTelefonofijo(String telefonofijo) {
		this.telefonofijo = telefonofijo;
	}

	public String getTelefonocelular() {
		return telefonocelular;
	}

	public void setTelefonocelular(String telefonocelular) {
		this.telefonocelular = telefonocelular;
	}

	public TriajeModel(int id, String nombrepaciente, String apellidopaciente, String responsablenombre,
			String responsableapellido, String telefonofijo, String telefonocelular) {
		super();
		this.id = id;
		this.nombrepaciente = nombrepaciente;
		this.apellidopaciente = apellidopaciente;
		this.responsablenombre = responsablenombre;
		this.responsableapellido = responsableapellido;
		this.telefonofijo = telefonofijo;
		this.telefonocelular = telefonocelular;
	}

	public TriajeModel() {
	}

	@Override
	public String toString() {
	    return new StringBuilder()
	    	.append("Paciente Nuevo!, los datos del paciente son: " + "\n")
	        .append("Nombre Paciente: " + nombrepaciente + "\n")
	        .append("Apellido Paciente: " + apellidopaciente + "\n")
	        .append("Nombre Responsable: " + responsablenombre + "\n")
	        .append("Apellido Responsable: " + responsableapellido + "\n")
	        .append("Telefono Fijo: " + "01" + telefonofijo +  "\n")
	        .append("Telefono Celular: " + telefonocelular + "\n")
	      
	        .toString();
	}
	
}
