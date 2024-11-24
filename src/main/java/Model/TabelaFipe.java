package Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record TabelaFipe(String Valor, String Marca,
                         String Modelo, String AnoModelo,
                         String Combustivel) {

    @Override
    public String toString() {
        return """
        TabelaFipe:
        O valor é: %s,
        a marca é: %s,
        o modelo é: %s,
        o ano do modelo é: %s,
        e o combustível é: %s
        """.formatted(Valor, Marca, Modelo, AnoModelo, Combustivel);

    }
}
