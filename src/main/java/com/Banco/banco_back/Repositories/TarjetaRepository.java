package com.Banco.banco_back.Repositories;

import com.Banco.banco_back.Models.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
}
