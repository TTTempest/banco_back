package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.ClienteDto;
import com.Banco.banco_back.Models.Cliente;

import java.util.List;

public interface ClienteService {
    public List<ClienteDto> mostrarClientes();
    public ClienteDto mostrarClienteById(Long id);
    public ClienteDto crearCliente(Cliente clienteDto);
    public ClienteDto actualizarCliente(Cliente cliente, Long id);
}
