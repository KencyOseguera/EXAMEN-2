package hn.unah.lenguajes.datos.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cuentas")
public class Cuentas {
    @Id
    @Column(name="numerocuenta")
    private String numeroCuenta;

    private Double saldo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertua;

    private Boolean estado;

    private Boolean sobregiro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;


}
