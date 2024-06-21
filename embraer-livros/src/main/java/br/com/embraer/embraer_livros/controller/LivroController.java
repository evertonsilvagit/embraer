package br.com.embraer.embraer_livros.controller;

import br.com.embraer.embraer_livros.model.Livro;
import br.com.embraer.embraer_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public ResponseEntity<List<Livro>> list() {

        List<Livro> list = livroRepository.findAll();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
