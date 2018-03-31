package com.nj.terapias.component;

import org.springframework.stereotype.Component;

import com.nj.terapias.entity.Triaje;
import com.nj.terapias.model.TriajeModel;

@Component("triajeConverter")
public class TriajeConverter {

	
	public Triaje convertTriajeModel2Triaje(TriajeModel triajeModel) {
		Triaje triaje = new Triaje();
		triaje.setId(triajeModel.getId());
		triaje.setApellidopaciente(triajeModel.getApellidopaciente());
		triaje.setNombrepaciente(triajeModel.getNombrepaciente());
		triaje.setResponsableapellido(triajeModel.getResponsableapellido());
		triaje.setResponsablenombre(triajeModel.getResponsablenombre());
		triaje.setTelefonofijo(triajeModel.getTelefonofijo());
		triaje.setTelefonocelular(triajeModel.getTelefonocelular());
		return triaje;
		
	}
	
	public TriajeModel convertTriaje2TriajeModel(Triaje triaje) {
		TriajeModel triajeModel = new TriajeModel();
		triajeModel.setId(triaje.getId());
		triajeModel.setApellidopaciente(triaje.getApellidopaciente());
		triajeModel.setNombrepaciente(triaje.getNombrepaciente());
		triajeModel.setResponsableapellido(triaje.getResponsableapellido());
		triajeModel.setResponsablenombre(triaje.getResponsablenombre());
		triajeModel.setTelefonofijo(triaje.getTelefonofijo());
		triajeModel.setTelefonocelular(triaje.getTelefonocelular());
		return triajeModel;
	}
}
