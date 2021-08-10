package br.com.oficina.automotivesystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ModeloVeiculo modeloVeiculo;
    private Long km;
    private String placa;
    private LocalDate ultimaRevisao;

    public Veiculo() {
    }

    public Veiculo(ModeloVeiculo modeloVeiculo, Long km, String placa, LocalDate ultimaRevisao) {
        this.modeloVeiculo = modeloVeiculo;
        this.km = km;
        this.placa = placa;
        this.ultimaRevisao = ultimaRevisao;
    }

    public ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public Long getKm() {
        return km;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getUltimaRevisao() {
        return ultimaRevisao;
    }

    public void setUltimaRevisao(LocalDate ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }
}
