package hn.unah.lenguajes.datos.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.datos.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    Optional<Cliente> findByDni(String dni);
}
