package com.Banco.banco_back.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "empleados")
public class Empleado extends Usuario{
    private String numEmpleado;
    private String cargo;
    private LocalDate fechaIngreso;
    @ManyToMany(mappedBy = "empleados")
    private List<Cliente> clientes;

    @ManyToOne
    private Jefe jefe;
}
