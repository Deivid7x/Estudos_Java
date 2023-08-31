
public class IfElseElseIf {
    public static void main(String[] args) {
        int nota = 4;

        if (nota >= 6) { // Lembre-se de usar as {} para colocar o bloco dentro
            System.out.println("Aprovado!");
        }
        else if (nota == 5) {
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!");
        }

        // Existe outra forma de fazer esse mesmo código acima usando condição ternária

        String resultado = nota >= 6 ? "Aprovado" : nota == 5 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }

}