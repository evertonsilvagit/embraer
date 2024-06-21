package br.com.embraer.embraer_livros.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LivroResponseDTO {

    private int id;
    private String nome;

}
