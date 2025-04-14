package com.desafio.padroesdeproj.strategyImpl;

import com.desafio.padroesdeproj.strategy.GeradorId;

import java.util.Random;

public class AleatorioStrategy implements GeradorId {
    @Override
    public String gerarId() {
        return String.valueOf(new Random().nextInt(10000));
    }
}
