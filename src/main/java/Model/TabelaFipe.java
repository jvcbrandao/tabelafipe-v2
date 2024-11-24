package Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record TabelaFipe(String Valor, String Marca,
                         String Modelo, String AnoModelo,
                         String Combustivel) {

    @Override
    public String toString() {
        return "TabelaFipe: " +
                "O valor é: " + Valor +
                ", a marca é: " + Marca +
                ", o modelo é: " + Modelo +
                ", o ano do modelo é: " + AnoModelo +
                " e o combustível é: " + Combustivel;
    }
}
