package br.com.embraer.embraer_livros.repository;


import br.com.embraer.embraer_livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
