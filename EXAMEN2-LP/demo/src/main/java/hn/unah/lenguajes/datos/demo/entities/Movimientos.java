package hn.unah.lenguajes.datos.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "movimientos")
public class Movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private Integer idMovimiento;

    @Column(name = "tipomovimiento")
    private Character tipoMovimiento;

    private Double monto;

    @Column(name = "fechamovimiento")
    private LocalDate fechaMovimiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="numerocuenta", referencedColumnName = "numerocuenta")
    private Cuentas cuentas;

}
