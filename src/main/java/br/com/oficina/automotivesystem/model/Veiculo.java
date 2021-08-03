package br.com.oficina.automotivesystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Montadora montadora;
    private LocalDate ano;
    private Long km;
    private String placa;
    private LocalDate ultimaRevisao;

    public Veiculo() {
    }

    public Veiculo(Montadora montadora, LocalDate ano, Long km, String placa, LocalDate ultimaRevisao) {
        this.montadora = montadora;
        this.ano = ano;
        this.km = km;
        this.placa = placa;
        this.ultimaRevisao = ultimaRevisao;
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
