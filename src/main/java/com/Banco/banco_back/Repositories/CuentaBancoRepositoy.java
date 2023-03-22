package com.Banco.banco_back.Repositories;

import com.Banco.banco_back.Models.CuentaBanco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaBancoRepositoy extends JpaRepository<CuentaBanco, Long> {
}
