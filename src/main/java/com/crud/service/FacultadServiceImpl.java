package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IFacultadDAO;
import com.crud.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;
	
	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public List<Facultad> listarFacultad() {
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad facultadPorId(Long id) {
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(Long id) {
		iFacultadDAO.deleteById(id);
	}

}
