import java.util.Scanner;
public class ex002 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Questão 1: Ler e imprimir uma matriz 2x4
            int[][] matriz2x4 = new int[2][4];
            System.out.println("Digite os elementos da matriz 2x4:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz2x4[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Matriz 2x4:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz2x4[i][j] + " ");
                }
                System.out.println();
            }

            // Questão 2: Operações em uma matriz 3x3
            int[][] matriz3x3 = new int[3][3];
            System.out.println("\nDigite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz3x3[i][j] = scanner.nextInt();
                }
            }

            int somaPrimeiraColuna = 0;
            int produtoPrimeiraLinha = 1;
            int somaTotal = 0;
            int somaDiagonalPrincipal = 0;

            for (int i = 0; i < 3; i++) {
                somaPrimeiraColuna += matriz3x3[i][0];
                somaDiagonalPrincipal += matriz3x3[i][i];
                for (int j = 0; j < 3; j++) {
                    somaTotal += matriz3x3[i][j];
                    if (i == 0) {
                        produtoPrimeiraLinha *= matriz3x3[i][j];
                    }
                }
            }

            System.out.println("\nResultados:");
            System.out.println("Soma da primeira coluna: " + somaPrimeiraColuna);
            System.out.println("Produto da primeira linha: " + produtoPrimeiraLinha);
            System.out.println("Soma de todos os elementos da matriz: " + somaTotal);
            System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

            scanner.close();
        }
    }

