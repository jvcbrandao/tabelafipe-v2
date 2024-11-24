package com.joao.brandao.tabelafipe20;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequisicaoAPI {

    public String conectarApi(String endereco){
        try {
            // Criar o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Criar a requisição HTTP (GET)
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(endereco)) // URL desejada
                    .GET() // Método HTTP (GET por padrão)
                    .build();

            // Enviar a requisição e obter a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e) {
            return "Não foi possível conectar! ";
        }
    }





}
