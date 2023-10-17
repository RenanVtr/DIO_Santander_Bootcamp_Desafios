package Desafios.AbrindoContas;


import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();
    double taxaJuros = scanner.nextDouble();


    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    //ContaBancaria cBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
    ContaPoupanca cPoupanca = new ContaPoupanca(numeroConta, nomeTitular, saldo, taxaJuros);

    

    System.out.println("Conta Poupanca:");
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    //System.out.println(cBancaria);
    cPoupanca.exibirInformacoes();
    

    
  }
}

