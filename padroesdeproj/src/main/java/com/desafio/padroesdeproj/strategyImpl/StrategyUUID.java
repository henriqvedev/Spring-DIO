package com.desafio.padroesdeproj.strategyImpl;
import com.desafio.padroesdeproj.strategy.GeradorId;

import java.util.UUID;

    public class StrategyUUID implements GeradorId {
        @Override
        public String gerarId() {
            return UUID.randomUUID().toString();
        }
    }

