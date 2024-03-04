import java.util.Scanner;

public class CustoMaças {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;

        // Verifica se o número de maçãs é maior ou igual a 12
        if (quantidade >= 12) {
            precoUnitario = 1.00;
        } else {
            precoUnitario = 1.30;
        }

        // Calcula o custo total da compra
        double custoTotal = quantidade * precoUnitario;

        // Exibe o custo total da compra
        System.out.println("O custo total da compra é: R$" + custoTotal);

        scanner.close();
    }
}