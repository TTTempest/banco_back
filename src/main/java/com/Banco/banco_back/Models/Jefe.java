package com.Banco.banco_back.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "jefes")
public class Jefe extends Usuario{
    private String numJefe;
    private int sueldo;

    @OneToMany(mappedBy = "jefe")
    private List<Empleado> empleados;
}
