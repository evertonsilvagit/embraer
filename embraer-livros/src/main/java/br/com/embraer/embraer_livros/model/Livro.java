package br.com.embraer.embraer_livros.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_livro")
    private List<Capitulo> capitulos;

}
