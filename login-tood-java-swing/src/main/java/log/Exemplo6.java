/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Exemplo6 {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner ler = new Scanner(System.in);
    String nome;
    double nota1, nota2;
    long n;

    RandomAccessFile diario = new RandomAccessFile("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\teste.txtAlex", "rw");

    diario.seek(diario.length()); // posiciona o ponteiro de posição no final do arquivo
    n = (diario.length() / 56) + 1; // número do novo registro
    while (true) {
      System.out.printf("%do. registro-------------------------------\n", n);
      System.out.printf("Informe o nome do aluno, FIM para encerrar:\n");
      nome = ler.nextLine();
      if (nome.equalsIgnoreCase("FIM"))
         break;

      System.out.printf("\nInforme a 1a. nota: ");
      nota1 = ler.nextDouble();

      System.out.printf("Informe a 2a. nota: ");
      nota2 = ler.nextDouble();

      ler.nextLine(); // esvazia o buffer do teclado

      gravarString(diario, nome, 20);
      diario.writeDouble(nota1);
      diario.writeDouble(nota2);

      n = n + 1;

      System.out.printf("\n");
    }
    diario.close();
  }

  private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
    StringBuilder result = new StringBuilder(s);
    result.setLength(tam);
    arq.writeChars(result.toString());
  }
}