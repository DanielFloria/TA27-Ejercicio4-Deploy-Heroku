package com.crud.service;

import java.util.List;

import com.crud.dto.Investigador;

public interface IInvestigadorService {
	public Investigador guardarInvestigador(Investigador investigador);
	
	public List<Investigador> listarInvestigador();
	
	public Investigador investigadorPorId(String dni);	
	
	public Investigador actualizarInvestigador(Investigador investigador);	
	
	public void eliminarInvestigador(String dni);
}
