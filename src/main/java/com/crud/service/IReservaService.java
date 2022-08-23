package com.crud.service;

import java.util.List;

import com.crud.dto.Reserva;

public interface IReservaService {
	public Reserva guardarReserva(Reserva reserva);
	
	public List<Reserva> listarReserva();
	
	public Reserva reservaPorId(Long id);	
	
	public Reserva actualizarReserva(Reserva reserva);	
	
	public void eliminarReserva(Long id);
}
