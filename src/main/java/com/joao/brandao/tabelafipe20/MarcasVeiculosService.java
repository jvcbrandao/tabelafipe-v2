package com.joao.brandao.tabelafipe20;

import Model.MarcasVeiculos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class MarcasVeiculosService {
    public List<MarcasVeiculos> parseMarcasVeiculos(String json) {
        try {
            // Criar o ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Transformar JSON em lista de MarcasVeiculos
            return mapper.readValue(json, new TypeReference<List<MarcasVeiculos>>() {});

        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar o JSON", e);
        }
    }
}
