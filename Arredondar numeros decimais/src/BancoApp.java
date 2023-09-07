import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.00"); // instanciando p DecimalFormat e definindo a quantidade de casas decimais como parâmetro
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        for (int index=0; index < periodo; index++){
          valorFinal += valorFinal * taxaJuros;
        }


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}