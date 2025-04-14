package com.desafio.padroesdeproj.service;

public class LogService {
    private static LogService instance;

    private LogService() {}

    public static LogService getInstance() {
        if (instance == null) {
            instance = new LogService();
        }
        return instance;
    }

    public void registrar(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}
