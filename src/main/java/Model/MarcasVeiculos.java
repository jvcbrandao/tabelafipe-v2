package Model;

public record MarcasVeiculos(String codigo, String nome) {

    @Override
    public String toString() {
        return "O código é: " + codigo + ", a marca é: " + nome;

    }
}
