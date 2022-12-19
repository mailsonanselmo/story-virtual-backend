package br.com.storyvirtual.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Entity
@Table(name = "cidades")
@Data 
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codidoCidade;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "codigoEstado")
    private Estado estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraCadastro;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    
}
