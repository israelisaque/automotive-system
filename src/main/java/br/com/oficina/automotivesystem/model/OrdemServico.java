package br.com.oficina.automotivesystem.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Veiculo veiculo;
    @ManyToOne
    private Cliente cliente;
    private BigDecimal valor;
    private String descricao;

    public OrdemServico() {
    }

    public OrdemServico(Veiculo veiculo, Cliente cliente, BigDecimal valor, String descricao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
