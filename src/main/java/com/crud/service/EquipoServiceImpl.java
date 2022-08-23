package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IEquipoDAO;
import com.crud.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;
	
	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public List<Equipo> listarEquipo() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo equipoPorId(String num_serie) {
		return iEquipoDAO.findById(num_serie).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String num_serie) {
		iEquipoDAO.deleteById(num_serie);
		
	}

}
