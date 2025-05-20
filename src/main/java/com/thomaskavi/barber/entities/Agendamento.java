package com.thomaskavi.barber.entities;

import java.time.Instant;

import com.thomaskavi.barber.enums.StatusAgendamento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_agendamento")

@Data

public class Agendamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Instant dataHora; // Para agendar, subtrai a hora escolhida com o instante atual. Ex: 20:00 - Now

  private StatusAgendamento status;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;

  @ManyToOne
  @JoinColumn(name = "barbeiro_id")
  private Barbeiro barbeiro;

  @ManyToOne
  @JoinColumn(name = "servico_id")
  private Servico servico;

  @ManyToOne
  @JoinColumn(name = "barbearia_id")
  private Barbearia barbearia;

}
