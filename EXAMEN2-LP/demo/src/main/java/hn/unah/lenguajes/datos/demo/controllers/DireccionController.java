package hn.unah.lenguajes.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.datos.demo.entities.Direccion;
import hn.unah.lenguajes.datos.demo.service.impl.DireccionServiceImpl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class DireccionController {
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/direccion/crear/{dni}")
    public Direccion crearDireccion(@PathVariable Direccion dni,
                                    @RequestBody Direccion direccion){
        return this.direccionServiceImpl.crearDireccion(dni);
    }
}
