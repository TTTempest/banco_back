package com.Banco.banco_back.DTO;

import java.util.List;

public class ClienteDto extends UsuarioDto{
    private String numCliente;
    private String email;
    private List<EmpleadoDtoRecort> empleadosDto;
    private PrestamoDtoRecort prestamoDto;
    private List<CuentaBancoDtoRecort> cuentasBancoDto;

}
