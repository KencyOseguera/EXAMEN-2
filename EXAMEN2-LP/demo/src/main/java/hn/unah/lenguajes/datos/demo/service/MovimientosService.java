package hn.unah.lenguajes.datos.demo.service;

import java.util.Optional;

import hn.unah.lenguajes.datos.demo.entities.Movimientos;

public interface MovimientosService {
    public Movimientos crearMovimientos(Movimientos movimientos);

    public Optional<Movimientos> obtenerMovimientosPorCuenta(String numerocuenta );
}
