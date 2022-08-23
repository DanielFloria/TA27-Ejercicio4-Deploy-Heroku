package com.crud.service;

import java.util.List;

import com.crud.dto.Equipo;

public interface IEquipoService {
	public Equipo guardarEquipo(Equipo equipo);
	
	public List<Equipo> listarEquipo();
	
	public Equipo equipoPorId(String num_serie);	
	
	public Equipo actualizarEquipo(Equipo equipo);	
	
	public void eliminarEquipo(String num_serie);
}
