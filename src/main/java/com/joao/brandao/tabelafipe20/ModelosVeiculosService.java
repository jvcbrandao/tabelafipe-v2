package com.joao.brandao.tabelafipe20;

import Model.ModelosResposta;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ModelosVeiculosService {

    public List<ModelosResposta.Modelo> parseModelosVeiculos(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ModelosResposta resposta = mapper.readValue(json, ModelosResposta.class);
            return resposta.modelos();

        } catch (Exception e) {
            System.err.println("Erro ao processar o JSON: " + e.getMessage());
            return List.of();
        }
    }
}
