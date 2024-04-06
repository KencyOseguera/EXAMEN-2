package hn.unah.lenguajes.datos.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Direccion;
import hn.unah.lenguajes.datos.demo.repositories.DireccionRepository;
import hn.unah.lenguajes.datos.demo.service.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion) {
        return (Direccion)this.direccionRepository.save(direccion);
    }

}
