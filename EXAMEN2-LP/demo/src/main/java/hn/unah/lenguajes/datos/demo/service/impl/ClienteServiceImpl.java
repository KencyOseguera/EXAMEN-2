package hn.unah.lenguajes.datos.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Cliente;
import hn.unah.lenguajes.datos.demo.repositories.ClienteRepository;
import hn.unah.lenguajes.datos.demo.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obtenerClientes() {
       return (List<Cliente>)this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni);
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
       
         //Optional<Cliente> clienteExiste= this.clienteRepository.findByDni(cliente.getDni());
         //if (clienteExiste.isPresent()) {
             //return "El dni existe";
         //}

        if(this.clienteRepository.existsById(cliente.getDni())){
            throw new UnsupportedOperationException("El cliente con dni existe");
        }     

         // Guardar el cliente en la base de datos
         return (Cliente)this.clienteRepository.save(cliente);
     }

}
