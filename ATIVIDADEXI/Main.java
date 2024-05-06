import java.util.Scanner;

class Calculadora {

    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return 0;
        }
        return num1 / num2;
    }

    public double potencia(double base, double expoente) {
        if (expoente == 0) {
            return 1;
        }
        return Math.pow(base, expoente);
    }

    public double raiz(double num) {
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return 0;
        }
        return Math.sqrt(num);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        char opcao;

        do {
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz quadrada");
            System.out.println("Q - Sair");

            opcao = scanner.next().charAt(0);

            if (opcao >= '1' && opcao <= '6') {
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                double resultado = 0;

                if (opcao != '6') {
                    System.out.println("Digite o segundo número:");
                    double num2 = scanner.nextDouble();

                    switch (opcao) {
                        case '1':
                            resultado = calc.adicao(num1, num2);
                            break;
                        case '2':
                            resultado = calc.subtracao(num1, num2);
                            break;
                        case '3':
                            resultado = calc.multiplicacao(num1, num2);
                            break;
                        case '4':
                            resultado = calc.divisao(num1, num2);
                            break;
                        case '5':
                            resultado = calc.potencia(num1, num2);
                            break;
                    }
                } else {
                    resultado = calc.raiz(num1);
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcao != 'Q' && opcao != 'q') {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 'Q' && opcao != 'q');

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
