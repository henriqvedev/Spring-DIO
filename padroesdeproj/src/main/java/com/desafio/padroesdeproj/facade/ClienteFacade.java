package com.desafio.padroesdeproj.facade;

import com.desafio.padroesdeproj.model.Cliente;
import com.desafio.padroesdeproj.service.ClienteService;
import com.desafio.padroesdeproj.service.LogService;
import com.desafio.padroesdeproj.strategy.GeradorId;

import java.util.List;

public class ClienteFacade {

    private final ClienteService clienteService = new ClienteService();
    private final LogService logService = LogService.getInstance();
    private final GeradorId geradorId;

    public ClienteFacade(GeradorId geradorId) {
        this.geradorId = geradorId;
    }

    public void cadastrarCliente(String nome) {
        String id = geradorId.gerarId();
        Cliente cliente = new Cliente(id, nome);
        clienteService.salvar(cliente);
        logService.registrar("Cliente cadastrado: " + nome + " (ID: " + id + ")");
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarTodos();
    }
}