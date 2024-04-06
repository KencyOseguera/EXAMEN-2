package hn.unah.lenguajes.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hn.unah.lenguajes.datos.demo.entities.Cuentas;
import hn.unah.lenguajes.datos.demo.service.impl.CuentasServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class CuentaController {
    @Autowired 
    private CuentasServiceImpl cuentasServiceImpl;

    @PostMapping("/cuentas/crear")
    public Cuentas crearCuentas(@RequestBody Cuentas cuentas) {
        return this.cuentasServiceImpl.crearCuenta(cuentas);
    }
    
}
