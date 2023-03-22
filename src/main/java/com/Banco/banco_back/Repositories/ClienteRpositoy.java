package com.Banco.banco_back.Repositories;

import com.Banco.banco_back.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRpositoy extends JpaRepository<Cliente, Long> {
}
