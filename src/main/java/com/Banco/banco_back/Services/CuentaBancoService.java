package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.ClienteDto;
import com.Banco.banco_back.DTO.CuentaBancoDto;
import com.Banco.banco_back.Models.Cliente;
import com.Banco.banco_back.Models.CuentaBanco;

import java.util.List;

public interface CuentaBancoService {

    public List<CuentaBancoDto> mostrarCuentas();
    public CuentaBancoDto mostrarCuentasById(Long id);
    public CuentaBancoDto crearCliente(CuentaBanco cuenta);
    public ClienteDto actualizarCliente(CuentaBanco cuenta, Long id);

}
