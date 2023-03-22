package com.Banco.banco_back.Repositories;

import com.Banco.banco_back.Models.Jefe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JefeRepository extends JpaRepository<Jefe, Long> {
}
