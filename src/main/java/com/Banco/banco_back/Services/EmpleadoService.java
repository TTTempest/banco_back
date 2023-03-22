package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.EmpleadoDto;
import com.Banco.banco_back.Models.Empleado;

import java.util.List;

public interface EmpleadoService {
    public List<EmpleadoDto> mostrarEmpleados();
    public EmpleadoDto mostrarEmpleadoById(Long id);
    public EmpleadoDto crearEmpleado(Empleado empleadoDto);
    public EmpleadoDto actualizarEmpleado(Empleado empleado, Long id);
}
