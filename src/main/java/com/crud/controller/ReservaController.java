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

import com.crud.dto.Reserva;
import com.crud.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;

	@PostMapping("/reservas")
	public Reserva guardarReserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarReserva(reserva);
	}

	@GetMapping("/reservas")
	public List<Reserva> listarReserva() {
		return reservaServiceImpl.listarReserva();
	}

	@GetMapping("/reservas/{id}")
	public Reserva reservaPorId(@PathVariable(name="id") Long id) {
		Reserva reservaPorId = new Reserva();
		reservaPorId = reservaServiceImpl.reservaPorId(id);
		
		return reservaPorId;
	}	

	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id") Long id, @RequestBody Reserva reserva) {
		Reserva reservaSeleccionado = new Reserva();
		Reserva reservaActualizado = new Reserva();

		reservaSeleccionado = reservaServiceImpl.reservaPorId(id);

		reservaSeleccionado.setInvestigador(reserva.getInvestigador());
		reservaSeleccionado.setEquipo(reserva.getEquipo());
		reservaSeleccionado.setComienzo(reserva.getComienzo());
		reservaSeleccionado.setFin(reserva.getFin());

		reservaActualizado = reservaServiceImpl.actualizarReserva(reservaSeleccionado);

		return reservaActualizado;
	}

	@DeleteMapping("/reservas/{id}")
	public void borrarReserva(@PathVariable(name="id") Long id) {
		reservaServiceImpl.eliminarReserva(id);
	}

}
