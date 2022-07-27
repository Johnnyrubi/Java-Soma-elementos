package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class SomaValores {
  /**
   * class main.
   */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    int[] myArray = new int[3];
    int soma = 0;
    // Laço de repetição
    for (int index = 0; index < 3; index++) {
      System.out.println("Digite um número:");
      myArray[index] = scan.nextInt();
    }

    // Seu código aqui
    soma += myArray[0] + myArray[1] + myArray[2];

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("A soma é: " + soma);

  }

}
