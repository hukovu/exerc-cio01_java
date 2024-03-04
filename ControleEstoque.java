public class ControleEstoque {
    public static void main(String[] args) {
        // Quantidade atual, máxima e mínima em estoque (definidas pelo programador)
        int quantidadeAtual = 50;
        int quantidadeMaxima = 100;
        int quantidadeMinima = 20;

        // Calcula a quantidade média em estoque
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        // Verifica se a quantidade atual em estoque é maior ou igual à quantidade média
        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}