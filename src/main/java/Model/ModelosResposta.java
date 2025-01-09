package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelosResposta(List<Modelo> modelos) {

    public record Modelo(int codigo, String nome) {
        @Override
        public String toString() {
            return "O código é: " + codigo +
                    ", o nome é: " + nome;
        }
    }
}
