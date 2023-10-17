package Desafios.CofresSeguros;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      CofreDigital cDigital = new CofreDigital(senha);
      int senhaDigitada = scanner.nextInt();
      System.out.println("Tipo: Cofre Digital");
      System.out.println("Metodo de abertura: Senha");
      if (cDigital.validarSenha(senhaDigitada)){
      System.out.println("Cofre aberto!");
      
      }else{
        System.out.println("Senha incorreta!");
      }

  }else{
    if (tipoCofre.equalsIgnoreCase("fisico")){
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
    }
  }}
}
