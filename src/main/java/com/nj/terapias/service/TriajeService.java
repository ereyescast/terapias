package com.nj.terapias.service;

import java.util.List;

import com.nj.terapias.entity.Triaje;
import com.nj.terapias.model.TriajeModel;

public interface TriajeService {

	public abstract TriajeModel addContact(TriajeModel triajeModel);
	
	public abstract List<TriajeModel> listAllTriaje();
	
	public abstract Triaje findTriajeById(int id);
	
	public abstract void removeTriaje(int id);

	TriajeModel findTriajeByIdModel(int id);
}
