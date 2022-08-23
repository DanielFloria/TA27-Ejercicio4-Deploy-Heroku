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

import com.crud.dto.Facultad;
import com.crud.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;

	@PostMapping("/facultades")
	public Facultad guardarFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarFacultad(facultad);
	}

	@GetMapping("/facultades")
	public List<Facultad> listarFacultad() {
		return facultadServiceImpl.listarFacultad();
	}

	@GetMapping("/facultades/{id}")
	public Facultad facultadPorId(@PathVariable(name="id") Long id) {
		Facultad facultadPorId = new Facultad();
		facultadPorId = facultadServiceImpl.facultadPorId(id);
		
		return facultadPorId;
	}	

	@PutMapping("/facultades/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id") Long id, @RequestBody Facultad facultad) {
		Facultad facultadSeleccionado = new Facultad();
		Facultad facultadActualizado = new Facultad();

		facultadSeleccionado = facultadServiceImpl.facultadPorId(id);

		facultadSeleccionado.setNombre(facultad.getNombre());

		facultadActualizado = facultadServiceImpl.actualizarFacultad(facultadSeleccionado);

		return facultadActualizado;
	}

	@DeleteMapping("/facultades/{id}")
	public void borrarFacultad(@PathVariable(name="id") Long id) {
		facultadServiceImpl.eliminarFacultad(id);
	}

}
