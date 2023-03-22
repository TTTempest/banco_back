package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.ClienteDto;
import com.Banco.banco_back.DTO.CuentaBancoDto;
import com.Banco.banco_back.Models.CuentaBanco;

import java.util.List;

public class CuentaBancoServiceImpt implements CuentaBancoService{
    @Override
    public List<CuentaBancoDto> mostrarCuentas() {
        return null;
    }

    @Override
    public CuentaBancoDto mostrarCuentasById(Long id) {
        return null;
    }

    @Override
    public CuentaBancoDto crearCliente(CuentaBanco cuenta) {
        return null;
    }

    @Override
    public ClienteDto actualizarCliente(CuentaBanco cuenta, Long id) {
        return null;
    }
}
