package com.seuusuario.apiveiculos.repository;
import com.seuusuario.apiveiculos.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
