package com.seuusuario.apiveiculos.service;

import com.seuusuario.apiveiculos.model.Veiculo;
import com.seuusuario.apiveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public void deletar(Long id) {
        veiculoRepository.deleteById(id);
    }

    public Veiculo atualizar(Long id, Veiculo novoVeiculo) {
        return veiculoRepository.findById(id).map(v -> {
            v.setModelo(novoVeiculo.getModelo());
            v.setMarca(novoVeiculo.getMarca());
            v.setAno(novoVeiculo.getAno());
            v.setPessoa(novoVeiculo.getPessoa());
            return veiculoRepository.save(v);
        }).orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }
}