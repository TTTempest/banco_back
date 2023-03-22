package com.Banco.banco_back.Models;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @SequenceGenerator(name = "id_user", sequenceName = "id_user", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "id_user")
    private Long id;
    //en este caso no se pone el @Column porque el nombre de la columna es igual al nombre del atributo
    //si se desea cambiar el nombre de la columna se pone @Column(name = "nombre") y tambien se puede poner @Column(nullable = false) para que no se pueda dejar vacio y otras porpiedades como unique, length, etc
    private String nombre;
    private String usuario;
    private String clave;

}
