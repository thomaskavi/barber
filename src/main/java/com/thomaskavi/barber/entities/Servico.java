package com.thomaskavi.barber.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "tb_servico")
@Data
public class Servico {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String descricao;

  private BigDecimal preco;

  private Integer duracaoMinutos;

  @ManyToOne
  @JoinColumn(name = "barbearia_id")
  private Barbearia barbearia;

  @Getter
  @OneToMany(mappedBy = "servico")
  private List<Agendamento> agendamentos;

}
