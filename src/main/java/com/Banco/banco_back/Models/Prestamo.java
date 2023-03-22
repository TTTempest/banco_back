package com.Banco.banco_back.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prestamos")
public class Prestamo {
    @Id
    private Long id;
    private int cantidad;

    @OneToOne()
    private Cliente cliente;
}
