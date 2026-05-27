import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float saldo = 1100;

        System.out.println("*".repeat(30));
        System.out.println("""
                Dados iniciais do cliente:
                
                Nome:              Giovana Monteiro
                Tipo conta:        Corrente
                Saldo inicial:     R$1.100,00
                """);
        System.out.println("*".repeat(30));

        while (true) {
            System.out.println("""
                    
                    
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada: 
                    """);

            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor a ser depositado: ");
                    saldo += leitura.nextFloat();
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    float transferencia = leitura.nextFloat();

                    if (transferencia > saldo) {
                        System.out.println("Não há saldo suficiente para essa transferência.");
                    } else {
                        saldo -= transferencia;
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    leitura.close();
                    return; // encerra o main

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}