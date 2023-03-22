package com.Banco.banco_back.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cuentas")
public class CuentaBanco {
    @Id
    private Long id;
    private String numCuenta;
    private String tipoCuenta;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(mappedBy = "cuentaBanco") //de esta manera en la tabla tarjeta se crea una columna con el nombre de cuentaBanco
    private Tarjeta tarjeta;
}
