package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Equipo;
import com.crud.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;

	@PostMapping("/equipos")
	public Equipo guardarEquipo(@RequestBody Equipo equipo) {
		return equipoServiceImpl.guardarEquipo(equipo);
	}

	@GetMapping("/equipos")
	public List<Equipo> listarEquipo() {
		return equipoServiceImpl.listarEquipo();
	}

	@GetMapping("/equipos/{num_serie}")
	public Equipo equipoPorId(@PathVariable(name="num_serie") String dni) {
		Equipo equipoPorId = new Equipo();
		equipoPorId = equipoServiceImpl.equipoPorId(dni);

		return equipoPorId;
	}	

	@PutMapping("/equipos/{num_serie}")
	public Equipo actualizarEquipo(@PathVariable(name="num_serie") String dni, @RequestBody Equipo equipo) {
		Equipo equipoSeleccionado = new Equipo();
		Equipo equipoActualizado = new Equipo();

		equipoSeleccionado = equipoServiceImpl.equipoPorId(dni);

		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setFacultad(equipo.getFacultad());

		equipoActualizado = equipoServiceImpl.actualizarEquipo(equipoSeleccionado);

		return equipoActualizado;
	}

	@DeleteMapping("/equipos/{num_serie}")
	public void borrarEquipo(@PathVariable(name="num_serie") String dni) {
		equipoServiceImpl.eliminarEquipo(dni);
	}

}


