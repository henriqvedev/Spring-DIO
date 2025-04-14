package com.seuusuario.apiveiculos.repository;
import com.seuusuario.apiveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
