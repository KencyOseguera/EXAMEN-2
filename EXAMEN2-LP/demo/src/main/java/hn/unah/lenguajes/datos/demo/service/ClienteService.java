package hn.unah.lenguajes.datos.demo.service;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes.datos.demo.entities.Cliente;

public interface ClienteService {
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Optional<Cliente> obtenerClientePorDni(String dni);
}
