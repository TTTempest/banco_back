package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.ClienteDto;
import com.Banco.banco_back.DTO.TarjetaDto;
import com.Banco.banco_back.Models.Cliente;
import com.Banco.banco_back.Models.Tarjeta;

import java.util.List;

public interface TarjetaService {
    public List<TarjetaDto> mostrarTarjetas();
    public TarjetaDto mostrarTarjetaById(Long id);
    public TarjetaDto crearTarjeta(Tarjeta tarjeta);
    public TarjetaDto actualizarTarjeta(Tarjeta tarjeta, Long id);
}
