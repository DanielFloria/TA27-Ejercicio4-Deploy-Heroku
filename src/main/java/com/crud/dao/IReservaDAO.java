package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Long> {

}
