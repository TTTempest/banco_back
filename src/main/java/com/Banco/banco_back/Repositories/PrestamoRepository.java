package com.Banco.banco_back.Repositories;

import com.Banco.banco_back.Models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
