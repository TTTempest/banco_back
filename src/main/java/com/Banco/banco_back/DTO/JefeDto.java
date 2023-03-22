package com.Banco.banco_back.DTO;

import java.util.List;

public class JefeDto extends UsuarioDto{
    private String numJefe;
    private int sueldo;
    private List<EmpleadoDtoRecort> empleadosDto;
}
