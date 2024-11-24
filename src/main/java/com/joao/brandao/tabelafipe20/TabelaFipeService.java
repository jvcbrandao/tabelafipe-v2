package com.joao.brandao.tabelafipe20;

import Model.TabelaFipe;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class TabelaFipeService {


    public TabelaFipe parseTabelaFipe(String json) throws JsonProcessingException {

            ObjectMapper mapper = new ObjectMapper();

            TabelaFipe resposta = mapper.readValue(json, TabelaFipe.class);


            return resposta;


    }














}
