package com.thomaskavi.barber.entities;

import java.time.Instant;
import java.util.List;

import com.thomaskavi.barber.enums.BarbeariaStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "tb_barbearia")
@Data

public class Barbearia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String cnpj;

  private String email;

  private String telefone;

  private String rua;

  private String numero;

  private String complemento;

  private String bairro;

  private String cidade;

  private String estado;

  private String cep;

  private String imgUrl;

  private Instant dataCriacao;

  private BarbeariaStatus status;

  @Getter
  @OneToMany(mappedBy = "barbearia")
  private List<Usuario> usuarios;

  @Getter
  @OneToMany(mappedBy = "barbearia")
  private List<Barbeiro> barbeiros;

  @Getter
  @OneToMany(mappedBy = "barbearia")
  private List<Servico> servicos;

  @OneToMany(mappedBy = "barbearia")
  private List<Agendamento> agendamentos;

}
