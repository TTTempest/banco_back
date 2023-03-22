package com.Banco.banco_back.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente extends Usuario{
    private String numCliente;
    private String email;
    @ManyToMany
    @JoinTable(name = "Empleados_Clientes", //el joinTable no es obligatorio
            joinColumns = @JoinColumn(name = "empleado_id"),//esto se usa para personalizar el nombre de las columnas aunque JPA les pone nombre por defecto
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private List<Empleado> empleados;
    @OneToMany(mappedBy = "cliente")//de esta manera en la tabla cuentaBanco se crea una columna con el nombre de cliente
    private List<CuentaBanco> cuentas;
    @OneToOne
    private Prestamo prestamo;

}
