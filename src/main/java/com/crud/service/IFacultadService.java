package com.crud.service;

import java.util.List;

import com.crud.dto.Facultad;

public interface IFacultadService {
	public Facultad guardarFacultad(Facultad facultad);
	
	public List<Facultad> listarFacultad();
	
	public Facultad facultadPorId(Long id);	
	
	public Facultad actualizarFacultad(Facultad facultad);	
	
	public void eliminarFacultad(Long id);
}
