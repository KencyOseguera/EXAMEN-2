package hn.unah.lenguajes.datos.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Cuentas;
import hn.unah.lenguajes.datos.demo.entities.Movimientos;
import hn.unah.lenguajes.datos.demo.repositories.CuentaRepository;
import hn.unah.lenguajes.datos.demo.repositories.MovimientosRepository;
import hn.unah.lenguajes.datos.demo.service.MovimientosService;

@Service
public class MovimientosServiceImpl implements MovimientosService{

    @Autowired 
    private MovimientosRepository movimientosRepository;

    @Autowired
    private CuentaRepository cuentaRepository;

    public Movimientos crearMovimientos(Movimientos movimientos){
        
        return (Movimientos)this.movimientosRepository.save(movimientos);
    }

    @Override
    public Optional<Movimientos> obtenerMovimientosPorCuenta(String numerocuenta) {
       return (Optional<Movimientos>)this.movimientosRepository.findById(numerocuenta);
    }



}
