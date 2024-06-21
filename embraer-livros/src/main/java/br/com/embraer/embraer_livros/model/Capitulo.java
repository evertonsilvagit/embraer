package br.com.embraer.embraer_livros.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "capitulo")
public class Capitulo {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_pagina")
    private Pagina pagina;

}
