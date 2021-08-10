package br.com.oficina.automotivesystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ModeloVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Montadora montadora;
    private LocalDate ano;
    private String modelo;

    public ModeloVeiculo() {
    }

    public ModeloVeiculo(Montadora montadora, LocalDate ano, String modelo) {
        this.montadora = montadora;
        this.ano = ano;
        this.modelo = modelo;
    }


    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}



