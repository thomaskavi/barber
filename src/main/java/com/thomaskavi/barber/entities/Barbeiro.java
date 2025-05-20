package com.thomaskavi.barber.entities;

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
@Table(name = "tb_barbeiro")
@Data
public class Barbeiro {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String fotoUrl;

  @ManyToOne
  @JoinColumn(name = "barbearia_id")
  private Barbearia barbearia;

  @Getter
  @OneToMany(mappedBy = "barbeiro")
  private List<Agendamento> agendamentos;

}
