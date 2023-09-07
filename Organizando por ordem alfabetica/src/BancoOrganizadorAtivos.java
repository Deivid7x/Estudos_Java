import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine(); // é preciso colocar essa linha por que na linha anterior o scanner pega a quebra de linha ao invés do primeiro input abaixo

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }
    
    scanner.close();

    Collections.sort(ativos); // Organiza os itens da lista em ordem alfabética

    for (String item : ativos) {
      System.out.println(item);
    }
  }
}