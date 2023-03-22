package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.PrestamoDto;
import com.Banco.banco_back.Models.Prestamo;

import java.util.List;

public interface PrestamoService {
    public List<PrestamoDto> mostrarPrestamos();
    public PrestamoDto mostrarPrestamoById(Long id);
    public PrestamoDto crearPrestamo(Prestamo prestamo);
    public PrestamoDto actualizarPrestamo(Prestamo prestamo,Long id);
}
