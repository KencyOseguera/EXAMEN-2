package hn.unah.lenguajes.datos.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.datos.demo.entities.Cliente;
import hn.unah.lenguajes.datos.demo.service.impl.ClienteServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/cliente/obtener")    
    public List<Cliente> obtenerClientes(){
        return this.clienteServiceImpl.obtenerClientes();
    }


    @GetMapping("/cliente/obtenerPorDni/{dni}")
    public Optional<Cliente> obtenerClientePorDni(@PathVariable String dni) {
        return this.clienteServiceImpl.obtenerClientePorDni(dni);
    }
    
}
