package com.nj.terapias.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="triaje")
public class Triaje {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombrepaciente")
	private String nombrepaciente;
	
	@Column(name="apellidopaciente")
	private String apellidopaciente;
	
	@Column(name="responsablenombre")
	private String responsablenombre;
	
	@Column(name="responsableapellido")
	private String responsableapellido;
	
	@Column(name="telefonofijo")
	private String telefonofijo;
	
	@Column(name="telefonocelular")
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



	public Triaje(int id, String nombrepaciente, String apellidopaciente, String responsablenombre,
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



	public Triaje() {}
}
