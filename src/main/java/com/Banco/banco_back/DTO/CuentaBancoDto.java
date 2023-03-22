package com.Banco.banco_back.DTO;

import com.Banco.banco_back.Models.Cliente;
import jakarta.persistence.Id;

import java.util.List;

public class CuentaBancoDto {
    private int id;
    private String numCuenta;
    private String tipoCuenta;
    private ClienteDtoRcort clienteDto;
    private List<TarjetaDtoRcort> tarjetasDto;
}
