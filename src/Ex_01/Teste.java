package Ex_01;

import java.time.LocalDate;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner entradaDoUsuario = new Scanner(System.in);
        boolean executar = true;
        ContaBancaria conta = null;
        System.out.println("------------------ SISTEMA DE CADASTRO E OPERAÇÕES DE CONTA BANCÁRIA ------------------");

        do {
            System.out.println("\n1 - Criar conta \n2 - Sacar \n3 - Depositar \n4 - Saldo com rendimento \n5 - Dados da Conta");
            int opcao = entradaDoUsuario.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu 'Criar conta'.");
                    entradaDoUsuario.nextLine(); // Limpar o scanner
                    System.out.print("Informe o nome completo: ");
                    String nome = entradaDoUsuario.nextLine();
                    System.out.println("Informe um número para a conta: ");
                    int numeroConta = entradaDoUsuario.nextInt();
                    System.out.print("Informe o saldo inicial: ");
                    double saldoInicial = entradaDoUsuario.nextDouble();
                    conta = new ContaBancaria(nome, numeroConta, saldoInicial);
                    System.out.println("\n------------ A conta foi criada e está pronta para realizar operações.");
                    break;
                case 2:
                    System.out.println("Você escolheu 'Sacar'.");
                    System.out.print("Informe o valor para sacar: ");
                    double valorSaque = entradaDoUsuario.nextDouble();
                    if (conta != null) {
                        conta.sacar(valorSaque);
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu 'Depositar'.");
                    System.out.print("Informe o valor para depositar: ");
                    double valorDeposito = entradaDoUsuario.nextDouble();
                    if (conta != null) {
                        conta.depositar(valorDeposito);
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu 'Saldo com rendimento'.");
                    if (conta != null && conta instanceof ContaPoupanca) { //usada em Java para verificar se um objeto é uma instância de uma determinada classe - objeto instanceof Tipo
                        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                        double taxaRendimento = 0.1;
                        contaPoupanca.setTaxaDeRendimento(taxaRendimento);
                        contaPoupanca.calcularNovoSaldo(taxaRendimento);
                    } else {
                        System.out.println("Essa conta não possui rendimento.");
                    }
                    break;

                case 5:
                    System.out.println("Você escolheu 'Dados da Conta'.");
                    if (conta != null) {
                        System.out.println("Nome do Cliente: " + conta.getNomeDoCliente());
                        System.out.println("Número da Conta: " + conta.getNumConta());
                        System.out.println("Saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("\nDeseja realizar outra operação? (S/N)");
            String continuar = entradaDoUsuario.next();
            if (continuar.equalsIgnoreCase("N")) {
                executar = false;
            }

        } while (executar);

        System.out.println("Encerrando o programa...");

        entradaDoUsuario.close();
    }
}

