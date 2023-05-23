
package log;

import sptech.login.tood.java.swing.ConexaoMysql;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Alexsandro, Enzo & Bruna.
 */
public class File {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.printf("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\teste.txt");
    String nome = ler.nextLine();

    File objFile = new File(nome);
    if (objFile.exists()) {
       if (objFile.isFile()) {
          System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
            objFile.getName(),  objFile.length());
       }
       else {
         System.out.printf("\nConteúdo do diretório:\n");
         String diretorio[] = objFile.list();
         for (String item: diretorio) {
           System.out.printf("%s\n", item);
         }
       }
    } else System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
  }
}
