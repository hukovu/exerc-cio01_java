import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os comprimentos dos lados
        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verifica se os comprimentos dos lados formam um triângulo
        if (formaTriangulo(lado1, lado2, lado3)) {
            // Determina o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os comprimentos dos lados não formam um triângulo.");
        }

        scanner.close();
    }

    // Função para verificar se os comprimentos dos lados formam um triângulo
    public static boolean formaTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}