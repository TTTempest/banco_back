package com.Banco.banco_back.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "tarjetas")
public class Tarjeta {
    @Id
    private Long id;
    private String numTarjeta;
    private LocalDate fechaCaducidad;
    @OneToOne
    private CuentaBanco cuentaBanco;
}
