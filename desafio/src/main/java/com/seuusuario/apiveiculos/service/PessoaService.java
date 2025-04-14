package com.seuusuario.apiveiculos.service;

import com.seuusuario.apiveiculos.model.Pessoa;
import com.seuusuario.apiveiculos.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

    public Pessoa atualizar(Long id, Pessoa novaPessoa) {
        return pessoaRepository.findById(id).map(p -> {
            p.setNome(novaPessoa.getNome());
            p.setEmail(novaPessoa.getEmail());
            return pessoaRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }
}
