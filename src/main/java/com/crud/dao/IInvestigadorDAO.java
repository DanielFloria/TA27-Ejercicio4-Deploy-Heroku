package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Investigador;

public interface IInvestigadorDAO  extends JpaRepository<Investigador, String> {

}
