package com.apis.adopcionmascota.servicio;

import com.apis.adopcionmascota.dto.RefugioBasicoDto;
import com.apis.adopcionmascota.modelo.Refugio;

import java.util.List;
import java.util.Optional;

public interface IRefugioServicio {
    List<Refugio> listarRefugios();

    Refugio guardarRefugio(Refugio refugio);

    Optional<Refugio> buscarRefugioPorId(Long id);

    void eliminarRefugio(long id);

    /**
     * Transformar Refugio a RefugioBasicoDto, muestra el numero de animales de cada
     * refugio
     *
     * @param refugio
     * @return
     */
    RefugioBasicoDto convertirADtoBasico(Refugio refugio);

    Refugio validarDatos(Refugio refugio);

}
