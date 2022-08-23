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

import com.crud.dto.Investigador;
import com.crud.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;

	@PostMapping("/investigadores")
	public Investigador guardarInvestigador(@RequestBody Investigador investigador) {
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}

	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigador() {
		return investigadorServiceImpl.listarInvestigador();
	}

	@GetMapping("/investigadores/{dni}")
	public Investigador investigadorPorId(@PathVariable(name="dni") String dni) {
		Investigador investigadorPorId = new Investigador();
		investigadorPorId = investigadorServiceImpl.investigadorPorId(dni);

		return investigadorPorId;
	}	

	@PutMapping("/investigadores/{dni}")
	public Investigador actualizarInvestigador(@PathVariable(name="dni") String dni, @RequestBody Investigador investigador) {
		Investigador investigadorSeleccionado = new Investigador();
		Investigador investigadorActualizado = new Investigador();

		investigadorSeleccionado = investigadorServiceImpl.investigadorPorId(dni);

		investigadorSeleccionado.setNom_apels(investigador.getNom_apels());

		investigadorActualizado = investigadorServiceImpl.actualizarInvestigador(investigadorSeleccionado);

		return investigadorActualizado;
	}

	@DeleteMapping("/investigadores/{dni}")
	public void borrarInvestigador(@PathVariable(name="dni") String dni) {
		investigadorServiceImpl.eliminarInvestigador(dni);
	}

}


