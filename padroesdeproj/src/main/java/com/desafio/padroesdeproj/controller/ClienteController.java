package com.desafio.padroesdeproj.controller;

import com.desafio.padroesdeproj.facade.ClienteFacade;
import com.desafio.padroesdeproj.model.Cliente;
import com.desafio.padroesdeproj.strategyImpl.StrategyUUID;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteFacade clienteFacade = new ClienteFacade(new StrategyUUID());

    @PostMapping
    public String cadastrar(@RequestParam String nome) {
        clienteFacade.cadastrarCliente(nome);
        return "Cliente cadastrado com sucesso!";
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteFacade.listarClientes();
    }
}
