package hn.unah.lenguajes.datos.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Cuentas;
import hn.unah.lenguajes.datos.demo.repositories.CuentaRepository;
import hn.unah.lenguajes.datos.demo.service.CuentasService;

@Service
public class CuentasServiceImpl implements CuentasService{

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Cuentas crearCuenta(Cuentas cuenta) {
       return (Cuentas)this.cuentaRepository.save(cuenta);
    }

}
