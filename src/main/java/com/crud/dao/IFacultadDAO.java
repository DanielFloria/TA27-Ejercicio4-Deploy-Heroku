package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Facultad;

public interface IFacultadDAO  extends JpaRepository<Facultad, Long> {

}
