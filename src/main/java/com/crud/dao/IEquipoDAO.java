package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Equipo;

public interface IEquipoDAO  extends JpaRepository<Equipo, String>{

}
