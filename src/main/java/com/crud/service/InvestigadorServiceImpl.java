package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IInvestigadorDAO;
import com.crud.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;
	
	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public List<Investigador> listarInvestigador() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador investigadorPorId(String dni) {
		return iInvestigadorDAO.findById(dni).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String dni) {
		iInvestigadorDAO.deleteById(dni);
	}

}
