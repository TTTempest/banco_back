package com.Banco.banco_back.DTO;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoDto extends UsuarioDto{
    private String numEmpleado;
    private String cargo;
    private LocalDate fechaContratacion;
    private JefeDtoRecot jefeDto;
    private List<ClienteDtoRcort> clientesDto;
}
