package com.tutorial.mssimulacion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "simulacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long idUsuario;
    private Long idPrestamo;
    private double cuotaMensual;
    private double tasaInteresAnual;
    private int plazo;
    private double monto;
}

