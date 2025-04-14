package com.desafio.padroesdeproj.service;
import com.desafio.padroesdeproj.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
        private final List<Cliente> clientes = new ArrayList<>();

        public void salvar(Cliente cliente) {
            clientes.add(cliente);
        }

        public List<Cliente> listarTodos() {
            return clientes;
        }
    }

