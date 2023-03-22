package com.Banco.banco_back.Services;

import com.Banco.banco_back.DTO.JefeDto;
import com.Banco.banco_back.Models.Jefe;

import java.util.List;

public interface JefeService {
    public List<JefeDto> mostrarJefes();
    public JefeDto mostrarJefeById(Long id);
    public JefeDto crearJefe(Jefe jefeDto);
    public JefeDto actualizarJefe(Jefe jefe, Long id);


}
