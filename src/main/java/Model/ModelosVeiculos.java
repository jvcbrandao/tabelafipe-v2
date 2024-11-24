package Model;

public record ModelosVeiculos(String codigo, String nome) {

    @Override
    public String toString() {
        return "O código é " + codigo + ", o nome é " + nome;
    }
}
