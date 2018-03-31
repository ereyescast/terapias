package com.nj.terapias.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nj.terapias.component.TriajeConverter;

import com.nj.terapias.entity.Triaje;
import com.nj.terapias.model.TriajeModel;
import com.nj.terapias.repository.TriajeRepository;
import com.nj.terapias.service.TriajeService;

@Service("triajeServiceImpl")
public class TriajeServiceImpl implements TriajeService {

	//private static final Log LOG = LogFactory.getLog(TriajeServiceImpl.class);
	
	@Autowired
	@Qualifier("triajeRepository")
	private TriajeRepository triajeRepository;
	
	@Autowired
	@Qualifier("triajeConverter")
	private TriajeConverter triajeConverter;
	
	@Override
	public TriajeModel addContact(TriajeModel triajeModel) {
		Triaje triaje = triajeRepository.save(triajeConverter.convertTriajeModel2Triaje(triajeModel));
		return triajeConverter.convertTriaje2TriajeModel(triaje);
	}

	@Override
	public List<TriajeModel> listAllTriaje() {
		List<Triaje> triajes = triajeRepository.findAll();
		//LOG.info("METHOD: listAllTriaje() -- PARAMS:" + triajeModel.toString());
		List<TriajeModel> triajeModel = new ArrayList<TriajeModel>();
		for(Triaje triaje : triajes) {
			triajeModel.add(triajeConverter.convertTriaje2TriajeModel(triaje));
		}
		return triajeModel;
	}

	@Override
	public Triaje findTriajeById(int id) {
		return triajeRepository.findById(id);
		
	}
	
	@Override
	public TriajeModel findTriajeByIdModel(int id) {
		return triajeConverter.convertTriaje2TriajeModel(findTriajeById(id));
		
	}

	@Override
	public void removeTriaje(int id) {
		Triaje triaje = findTriajeById(id);
		if(null!=triaje) {
			triajeRepository.delete(triaje);
		}
		
		
		
	}

	
}
